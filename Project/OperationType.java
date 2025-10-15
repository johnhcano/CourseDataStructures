/**
 * Enum: OperationType (Tipo de Operación)
 * ---------------------------------------
 * Aquí se guardan los nombres de todas las acciones que se
 * pueden "deshacer" (Undo) en el sistema.
 * 
 * Ejemplos:
 * - Cuando agregas un libro → ADD_BOOK
 * - Cuando lo borras → REMOVE_BOOK
 * - Cuando prestas o devuelves un libro → BORROW, RETURN
 * - Cuando alguien entra a la lista de espera → ENQUEUE_RESERVATION
 *
 * En resumen:
 * - Define los tipos de acciones que el sistema puede revertir.
 */

 public enum OperationType {
    ADD_BOOK, UPDATE_BOOK, REMOVE_BOOK,
    REGISTER_USER, REMOVE_USER,
    BORROW, RETURN, ENQUEUE_RESERVATION
}
