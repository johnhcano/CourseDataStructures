import java.util.ArrayList;

/**
 * Clase que representa la biblioteca y gestiona la colección de libros.
 * 
 * Funcionalidades principales:
 * - Agregar libros a la biblioteca.
 * - Buscar libros por ISBN.
 * - Listar todos los libros almacenados.
 * - Eliminar libros por ISBN.
 * - Actualizar la información de un libro existente.
 * 
 * Uso:
 * Crear una instancia de Library y utilizar sus métodos para manipular la colección de libros.
 */
public class Library {
    // Lista que almacena los libros de la biblioteca
    private ArrayList<Book> books;

    /**
     * Constructor de la clase Library.
     * Inicializa la lista de libros vacía.
     */
    public Library(){
        books = new ArrayList<Book>();
    }

    /**
     * Agrega un nuevo libro a la biblioteca usando los datos proporcionados.
     * 
     * @param name Nombre del libro.
     * @param author Autor del libro.
     * @param isbn ISBN del libro.
     * @param category Categoría del libro.
     */
    public void addBook (String name, String author, String isbn, String category){
        Book newBook= new Book(name,author,isbn,category);
        books.add(newBook);
    }
    
    /**
     * Agrega un libro a la biblioteca si no existe otro con el mismo ISBN.
     * 
     * @param newBook Instancia de Book a agregar.
     */
    public void addBook (Book newBook){
        if (searchBook(newBook.isbn) ==  null) { 
            books.add(newBook);
        }
    }

    /**
     * Busca un libro en la biblioteca por su ISBN.
     * 
     * @param isbn ISBN del libro a buscar.
     * @return El libro encontrado o null si no existe.
     */
    public Book searchBook(String isbn){
        for (int i =0 ; i < books.size();i++){
            if (books.get(i).isbn.equalsIgnoreCase(isbn)){
                return books.get(i);
            }
        }
        return null;
    }

    /**
     * Devuelve un arreglo con todos los libros de la biblioteca.
     * 
     * @return Arreglo de libros.
     */
    public Book[] listBooks() {
        Book[] myBooks =  (Book[])books.toArray();
        return myBooks;
    }

    /**
     * Elimina un libro de la biblioteca por su ISBN.
     * 
     * @param isbn ISBN del libro a eliminar.
     */
    public void deleteBook(String isbn){
        for (int i =0 ; i < books.size();i++){
            if (books.get(i).isbn.equalsIgnoreCase(isbn)){
                books.remove(i);
                break;
            }
        }
    }

    /**
     * Actualiza la información de un libro existente en la biblioteca.
     * 
     * @param updatedBook Instancia de Book con los datos actualizados.
     */
    public void updateBook(Book updatedBook){
        for (int i =0 ; i < books.size();i++){
            if (books.get(i).isbn.equalsIgnoreCase(updatedBook.isbn)){
                books.set(i, updatedBook);
                break;
            }
        }
    }

}