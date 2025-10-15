/**
 * Clase: LibraryUI (Interfaz de Usuario)
 * --------------------------------------
 * Esta clase muestra los menús en la consola
 * y permite que el usuario use el sistema.
 * 
 * Desde aquí se pueden hacer las acciones principales:
 *  - Administrar libros (agregar, editar, eliminar, buscar).
 *  - Registrar o eliminar usuarios.
 *  - Prestar y devolver libros.
 *  - Usar la opción "Deshacer" para revertir la última acción.
 *
 * El programa funciona con un menú por consola:
 *  1. Libros
 *  2. Usuarios
 *  3. Préstamos
 *  4. Deshacer
 *  0. Salir
 *
 * En resumen:
 * - Es la parte visible del programa.
 * - Se encarga de hablar con el usuario y pedirle opciones.
 * - Llama a la clase Library para hacer las acciones.
 */

import java.util.Scanner;
import java.util.Stack;

public class LibraryUI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Operation> undo = new Stack<Operation>();
        Library lib = new Library(undo);

        boolean running = true;
        while (running) {
            System.out.println("\n==== Library Menu ====");
            System.out.println("1) Books");
            System.out.println("2) Users");
            System.out.println("3) Loans");
            System.out.println("4) Undo last operation");
            System.out.println("0) Exit");
            System.out.print("Choose: ");
            String opt = sc.nextLine();

            if ("1".equals(opt))
                booksMenu(sc, lib);
            else if ("2".equals(opt))
                usersMenu(sc, lib);
            else if ("3".equals(opt))
                loansMenu(sc, lib);
            else if ("4".equals(opt))
                lib.undoLast();
            else if ("0".equals(opt))
                running = false;
            else
                System.out.println("Invalid option.");
        }
        sc.close();
        System.out.println("Bye!");
    }

    private static void booksMenu(Scanner sc, Library lib) {
        boolean back = false;
        while (!back) {
            System.out.println("\n-- Books --");
            System.out.println("1) Add");
            System.out.println("2) Update");
            System.out.println("3) Remove");
            System.out.println("4) List");
            System.out.println("5) Search by title");
            System.out.println("6) Search by author");
            System.out.println("7) Search by ISBN");
            System.out.println("0) Back");
            System.out.print("Choose: ");
            String o = sc.nextLine();

            if ("1".equals(o)) {
                System.out.print("ISBN: ");
                String isbn = sc.nextLine();
                System.out.print("Title: ");
                String title = sc.nextLine();
                System.out.print("Author: ");
                String author = sc.nextLine();
                System.out.print("Category: ");
                String cat = sc.nextLine();
                lib.addBook(new Book(isbn, title, author, cat));
            } else if ("2".equals(o)) {
                System.out.print("ISBN to update: ");
                String isbn = sc.nextLine();
                System.out.print("New Title: ");
                String title = sc.nextLine();
                System.out.print("New Author: ");
                String author = sc.nextLine();
                System.out.print("New Category: ");
                String cat = sc.nextLine();
                if (!lib.updateBook(isbn, title, author, cat))
                    System.out.println("Not found.");
            } else if ("3".equals(o)) {
                System.out.print("ISBN to remove: ");
                String isbn = sc.nextLine();
                if (!lib.removeBook(isbn))
                    System.out.println("Not found.");
            } else if ("4".equals(o)) {
                lib.listBooks();
            } else if ("5".equals(o)) {
                System.out.print("Title contains: ");
                String q = sc.nextLine();
                lib.searchByTitle(q);
            } else if ("6".equals(o)) {
                System.out.print("Author contains: ");
                String q = sc.nextLine();
                lib.searchByAuthor(q);
            } else if ("7".equals(o)) {
                System.out.print("ISBN: ");
                String q = sc.nextLine();
                lib.searchByIsbn(q);
            } else if ("0".equals(o))
                back = true;
            else
                System.out.println("Invalid option.");
        }
    }

    private static void usersMenu(Scanner sc, Library lib) {
        boolean back = false;
        while (!back) {
            System.out.println("\n-- Users --");
            System.out.println("1) Register");
            System.out.println("2) Remove");
            System.out.println("3) List");
            System.out.println("4) Search by name");
            System.out.println("0) Back");
            System.out.print("Choose: ");
            String o = sc.nextLine();

            if ("1".equals(o)) {
                System.out.print("User id: ");
                String id = sc.nextLine();
                System.out.print("Name: ");
                String name = sc.nextLine();
                lib.registerUser(new User(id, name));
            } else if ("2".equals(o)) {
                System.out.print("User id to remove: ");
                String id = sc.nextLine();
                if (!lib.removeUser(id))
                    System.out.println("Not found.");
            } else if ("3".equals(o)) {
                lib.listUsers();
            } else if ("4".equals(o)) {
                System.out.print("Name contains: ");
                String q = sc.nextLine();
                lib.searchUserByName(q);
            } else if ("0".equals(o))
                back = true;
            else
                System.out.println("Invalid option.");
        }
    }

    private static void loansMenu(Scanner sc, Library lib) {
        boolean back = false;
        while (!back) {
            System.out.println("\n-- Loans --");
            System.out.println("1) Borrow");
            System.out.println("2) Return");
            System.out.println("3) List active loans");
            System.out.println("4) History");
            System.out.println("0) Back");
            System.out.print("Choose: ");
            String o = sc.nextLine();

            if ("1".equals(o)) {
                System.out.print("User id: ");
                String uid = sc.nextLine();
                System.out.print("ISBN: ");
                String isbn = sc.nextLine();
                lib.borrow(uid, isbn);
            } else if ("2".equals(o)) {
                System.out.print("User id: ");
                String uid = sc.nextLine();
                System.out.print("ISBN: ");
                String isbn = sc.nextLine();
                lib.returnBook(uid, isbn);
            } else if ("3".equals(o)) {
                lib.listActiveLoans();
            } else if ("4".equals(o)) {
                lib.printHistory();
            } else if ("0".equals(o))
                back = true;
            else
                System.out.println("Invalid option.");
        }
    }
}
