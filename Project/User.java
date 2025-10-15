/**
 * Clase: User (Usuario)
 * -------------------------------
 * Representa a una persona que usa la biblioteca.
 * Cada usuario tiene un número de identificación (id) y un nombre.
 * 
 * Además, cada usuario guarda su "historial de préstamos",
 * es decir, los libros que ha pedido prestados antes.
 *
 * Estructuras usadas:
 * - LinkedList: para guardar los ISBN de los libros que ha tenido.
 *
 * En resumen:
 * - Guarda la información básica del usuario.
 * - Mantiene un registro de los libros que ha pedido.
 */

 import java.util.LinkedList;

public class User {
    private String id;
    private String name;
    private LinkedList<String> loanHistory = new LinkedList<String>();

    public User(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        this.name = n;
    }

    public LinkedList<String> getLoanHistory() {
        return loanHistory;
    }

    public String toString() {
        return "[id=" + id + ", name=" + name + ", history=" + loanHistory.size() + "]";
    }
}
