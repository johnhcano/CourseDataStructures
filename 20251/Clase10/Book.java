/**
 * Clase que representa un libro dentro de la biblioteca.
 * 
 * Atributos principales:
 * - name: Nombre del libro.
 * - author: Autor del libro.
 * - isbn: Código ISBN único del libro.
 * - category: Categoría o género del libro.
 * 
 * Funcionalidades:
 * - Permite crear instancias de libros con información básica.
 * - Proporciona una representación en texto del libro.
 * 
 * Uso:
 * Crear objetos Book para almacenar y manipular información de libros en la biblioteca.
 */
public class Book {
    // Nombre del libro
    String name;
    // Autor del libro
    String author;
    // Código ISBN del libro
    String isbn;
    // Categoría o género del libro
    String category;

    /**
     * Constructor que inicializa todos los atributos del libro.
     * 
     * @param name Nombre del libro.
     * @param author Autor del libro.
     * @param isbn Código ISBN del libro.
     * @param category Categoría o género del libro.
     */
    public Book(String name, String author, String isbn, String category){
        this.name = name;
        this.author = author;
        this.isbn = isbn;
        this.category = category;
    }

    /**
     * Constructor vacío para crear un libro sin información inicial.
     */
    public Book () {
        super();
    }

    /**
     * Devuelve una representación en texto del libro con todos sus atributos.
     * 
     * @return Cadena con la información del libro.
     */
    public String toString(){
        return "Book name : " +name + " | Book Author : " +
         author + " |  Book isbn :" + isbn + " | Book category : " +  category;
    }
}