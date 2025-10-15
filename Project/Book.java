/**
 * Clase: Book (Libro)
 * -------------------------------
 * Esta clase representa un libro de la biblioteca.
 * Guarda su información básica: ISBN, título, autor y categoría.
 * También sabe si el libro está disponible o prestado.
 * 
 * Además, cada libro tiene una "lista de espera" donde se
 * van guardando los usuarios que quieren pedirlo cuando esté libre.
 *
 * Estructuras usadas:
 * - Queue (cola): para manejar la lista de espera de forma ordenada.
 *
 * En resumen:
 * - Guarda los datos del libro.
 * - Permite saber si está libre o prestado.
 * - Mantiene una cola de usuarios que esperan por el libro.
 */

 import java.util.LinkedList;
import java.util.Queue;

public class Book {
    private String isbn;
    private String title;
    private String author;
    private String category; // simple category (String)
    private boolean available; // one-copy model
    private Queue<String> waitingList; // FIFO reservations by userId

    public Book(String isbn, String title, String author, String category) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.category = category;
        this.available = true;
        this.waitingList = new LinkedList<String>();
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getCategory() {
        return category;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setTitle(String t) {
        this.title = t;
    }

    public void setAuthor(String a) {
        this.author = a;
    }

    public void setCategory(String c) {
        this.category = c;
    }

    public void setAvailable(boolean a) {
        this.available = a;
    }

    public Queue<String> getWaitingList() {
        return waitingList;
    }

    @Override
    public String toString() {
        return "[ISBN=" + isbn + ", title=" + title + ", author=" + author +
                ", category=" + category + ", available=" + available +
                ", queue=" + waitingList.size() + "]";
    }
}
