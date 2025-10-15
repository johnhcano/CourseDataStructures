/**
 * Clase: Loan (Préstamo)
 * -------------------------------
 * Representa un préstamo activo entre un usuario y un libro.
 * 
 * Solo guarda dos datos:
 *  - userId: quién tiene el libro.
 *  - isbn: qué libro tiene.
 *
 * En resumen:
 * - Sirve para saber qué usuario tiene prestado cada libro.
 */

 public class Loan {
    private String userId;
    private String isbn;

    public Loan(String userId, String isbn) {
        this.userId = userId;
        this.isbn = isbn;
    }

    public String getUserId() {
        return userId;
    }

    public String getIsbn() {
        return isbn;
    }

    public String toString() {
        return "[Loan user=" + userId + ", isbn=" + isbn + "]";
    }
}
