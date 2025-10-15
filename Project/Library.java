/**
 * Clase: Library (Biblioteca)
 * ---------------------------------
 * Esta es la clase principal del proyecto.
 * Aquí se maneja todo lo que pasa en la biblioteca:
 * 
 * 1. Los libros (agregar, editar, eliminar, buscar).
 * 2. Los usuarios (registrar, eliminar, listar, buscar).
 * 3. Los préstamos (prestar, devolver, mostrar historial).
 * 4. El sistema de "Deshacer" (Undo) para revertir acciones.
 *
 * Estructuras usadas:
 * - ArrayList: para listas de libros, usuarios y préstamos.
 * - LinkedList: para el historial de operaciones.
 * - Queue: para la lista de espera de libros ocupados.
 * - Stack: para guardar las acciones que se pueden deshacer.
 *
 * En resumen:
 * - Controla toda la lógica del sistema.
 * - Cada vez que haces algo (agregar, borrar, etc.),
 *   guarda cómo revertirlo si luego usas "Deshacer".
 *
 * Sobre el método Undo:
 * ------------------------
 * Cuando el usuario elige "Deshacer", el sistema toma
 * la última acción guardada en la pila (como si fuera Ctrl+Z)
 * y ejecuta la acción contraria:
 * 
 * Ejemplo:
 *  - Si agregaste un libro, Undo lo borra.
 *  - Si borraste un libro, Undo lo vuelve a crear.
 *  - Si prestaste un libro, Undo lo devuelve.
 * 
 * Esto permite volver atrás paso a paso en orden inverso.
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Library {
    // Data stores
    private ArrayList<Book> books = new ArrayList<Book>();
    private ArrayList<User> users = new ArrayList<User>();
    private ArrayList<Loan> activeLoans = new ArrayList<Loan>();
    private LinkedList<String> operationHistory = new LinkedList<String>(); // latest first
    private Stack<Operation> undoStack;

    public Library(Stack<Operation> undoStack) {
        this.undoStack = undoStack;
    }

    // ===== BOOKS =====
    public Book findBook(String isbn) {
        for (int i = 0; i < books.size(); i++) {
            Book b = books.get(i);
            if (b.getIsbn().equals(isbn))
                return b;
        }
        return null;
    }

    public void addBook(Book b) {
        books.add(b);
        // inverse action for undo: remove the added book
        undoStack.push(new Operation(OperationType.REMOVE_BOOK, b.getIsbn(), b.getTitle(),
                b.getAuthor() + "\t" + b.getCategory()));
    }

    public boolean updateBook(String isbn, String newTitle, String newAuthor, String newCategory) {
        Book b = findBook(isbn);
        if (b == null)
            return false;
        String oldTitle = b.getTitle();
        String oldAuthor = b.getAuthor();
        String oldCat = b.getCategory();

        b.setTitle(newTitle);
        b.setAuthor(newAuthor);
        b.setCategory(newCategory);

        // inverse: restore previous fields
        undoStack.push(new Operation(OperationType.UPDATE_BOOK, isbn, oldTitle, oldAuthor + "\t" + oldCat));
        return true;
    }

    public boolean removeBook(String isbn) {
        for (int i = 0; i < books.size(); i++) {
            Book b = books.get(i);
            if (b.getIsbn().equals(isbn)) {
                books.remove(i);
                // inverse: re-add book with its old fields
                undoStack.push(new Operation(OperationType.ADD_BOOK, isbn, b.getTitle(),
                        b.getAuthor() + "\t" + b.getCategory()));
                return true;
            }
        }
        return false;
    }

    public void listBooks() {
        System.out.println("=== Books ===");
        Iterator<Book> it = books.iterator();
        while (it.hasNext()) {
            System.out.println(it.next().toString());
        }
    }

    public void searchByTitle(String q) {
        for (int i = 0; i < books.size(); i++) {
            Book b = books.get(i);
            if (b.getTitle().toLowerCase().indexOf(q.toLowerCase()) >= 0)
                System.out.println(b);
        }
    }

    public void searchByAuthor(String q) {
        Iterator<Book> it = books.iterator();
        while (it.hasNext()) {
            Book b = it.next();
            if (b.getAuthor().toLowerCase().indexOf(q.toLowerCase()) >= 0)
                System.out.println(b);
        }
    }

    public void searchByIsbn(String isbn) {
        Book b = findBook(isbn);
        System.out.println(b == null ? "Not found" : b.toString());
    }

    // ===== USERS =====
    public User findUser(String id) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getId().equals(id))
                return users.get(i);
        }
        return null;
    }

    public void registerUser(User u) {
        users.add(u);
        // inverse: remove registered user
        undoStack.push(new Operation(OperationType.REMOVE_USER, u.getId(), u.getName(), null));
    }

    public boolean removeUser(String id) {
        for (int i = 0; i < users.size(); i++) {
            User u = users.get(i);
            if (u.getId().equals(id)) {
                users.remove(i);
                // inverse: re-register the removed user
                undoStack.push(new Operation(OperationType.REGISTER_USER, u.getId(), u.getName(), null));
                return true;
            }
        }
        return false;
    }

    public void listUsers() {
        System.out.println("=== Users ===");
        Iterator<User> it = users.iterator();
        while (it.hasNext())
            System.out.println(it.next());
    }

    public void searchUserByName(String q) {
        for (int i = 0; i < users.size(); i++) {
            User u = users.get(i);
            if (u.getName().toLowerCase().indexOf(q.toLowerCase()) >= 0)
                System.out.println(u);
        }
    }

    // ===== LOANS =====
    public boolean borrow(String userId, String isbn) {
        User u = findUser(userId);
        Book b = findBook(isbn);
        if (u == null || b == null) {
            System.out.println("User or Book not found.");
            return false;
        }

        if (b.isAvailable()) {
            b.setAvailable(false);
            activeLoans.add(new Loan(userId, isbn));
            u.getLoanHistory().addFirst(isbn);
            operationHistory.addFirst("BORROW " + userId + " -> " + isbn);

            // inverse: return the book
            undoStack.push(new Operation(OperationType.RETURN, userId, isbn, null));
            System.out.println("Loan OK.");
            return true;
        } else {
            // enqueue reservation
            Queue<String> q = b.getWaitingList();
            q.add(userId);
            operationHistory.addFirst("ENQUEUE " + userId + " " + isbn);
            // inverse: remove one occurrence from queue
            undoStack.push(new Operation(OperationType.ENQUEUE_RESERVATION, userId, isbn, null));
            System.out.println("Book busy. Added to waiting list (pos " + q.size() + ").");
            return false;
        }
    }

    public boolean returnBook(String userId, String isbn) {
        int idx = -1;
        for (int i = 0; i < activeLoans.size(); i++) {
            Loan l = activeLoans.get(i);
            if (l.getUserId().equals(userId) && l.getIsbn().equals(isbn)) {
                idx = i;
                break;
            }
        }
        if (idx == -1) {
            System.out.println("Active loan not found.");
            return false;
        }

        activeLoans.remove(idx);
        operationHistory.addFirst("RETURN " + userId + " <- " + isbn);
        // inverse: re-borrow
        undoStack.push(new Operation(OperationType.BORROW, userId, isbn, null));

        Book b = findBook(isbn);
        if (b != null) {
            if (b.getWaitingList().isEmpty()) {
                b.setAvailable(true);
            } else {
                String nextUser = b.getWaitingList().poll();
                b.setAvailable(false);
                activeLoans.add(new Loan(nextUser, isbn));
                User nu = findUser(nextUser);
                if (nu != null)
                    nu.getLoanHistory().addFirst(isbn);
                operationHistory.addFirst("AUTO_BORROW -> " + nextUser + " " + isbn);
            }
        }
        System.out.println("Return OK.");
        return true;
    }

    public void listActiveLoans() {
        System.out.println("=== Active Loans ===");
        Iterator<Loan> it = activeLoans.iterator();
        while (it.hasNext())
            System.out.println(it.next());
    }

    public void printHistory() {
        System.out.println("=== Operation History (latest first) ===");
        Iterator<String> it = operationHistory.iterator();
        while (it.hasNext())
            System.out.println(it.next());
    }

    // ===== UNDO =====
    public boolean undoLast() {
        String msg = "Undo last operation ok. ";
        if (undoStack.isEmpty()) {
            System.out.println("Nothing to undo.");
            return false;
        }
        Operation op = undoStack.pop();
        OperationType t = op.getType();

        if (t == OperationType.REMOVE_BOOK){
            msg += "Removed book: " + op.getA();
            return removeBook(op.getA());
        }

        if (t == OperationType.UPDATE_BOOK) {
            String isbn = op.getA();
            String oldTitle = op.getB();
            String pair = op.getC();
            String oldAuthor = "";
            String oldCategory = "";
            int sep = pair.indexOf('\t');
            if (sep >= 0) {
                oldAuthor = pair.substring(0, sep);
                oldCategory = pair.substring(sep + 1);
            }
            msg += "Restored book: " + isbn;
            System.out.println(msg);
            return updateBook(isbn, oldTitle, oldAuthor, oldCategory);
        }

        if (t == OperationType.ADD_BOOK) {
            Book b = new Book(op.getA(), op.getB(), "", "");
            String pair = op.getC();
            int sep = pair.indexOf('\t');
            if (sep >= 0) {
                b.setAuthor(pair.substring(0, sep));
                b.setCategory(pair.substring(sep + 1));
            }
            addBook(b);
            msg += "Re-added book: " + b.getIsbn();
            System.out.println(msg);
            return true;
        }

        if (t == OperationType.REMOVE_USER){
            msg += "Removed user: " + op.getA();
            System.out.println(msg);
            return removeUser(op.getA());
        }

        if (t == OperationType.REGISTER_USER) {
            registerUser(new User(op.getA(), op.getB()));
            msg += "Re-registered user: " + op.getA();
            System.out.println(msg);
            return true;
        }
        if (t == OperationType.RETURN){
            msg += "Returned book: " + op.getA();
            System.out.println(msg);
            return returnBook(op.getA(), op.getB());
        }
        if (t == OperationType.BORROW){
            msg += "Borrowed book: " + op.getA();
            System.out.println(msg);
            return borrow(op.getA(), op.getB());
        }

        if (t == OperationType.ENQUEUE_RESERVATION) {
            Book b = findBook(op.getB());
            if (b != null) {
                Queue<String> q = b.getWaitingList();
                LinkedList<String> aux = new LinkedList<String>();
                boolean removed = false;
                while (!q.isEmpty()) {
                    String v = q.poll();
                    if (!removed && v.equals(op.getA()))
                        removed = true;
                    else
                        aux.add(v);
                }
                Iterator<String> it = aux.iterator();
                while (it.hasNext())
                    q.add(it.next());
            }
            System.out.println("Undo reservation queue change.");
            return true;
        }

        System.out.println("Unknown operation.");
        return false;
    }
}
