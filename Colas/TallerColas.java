import java.util.ArrayDeque;
import java.util.Queue;

public class TallerColas{
    public static void main(String[] args) {
        //Creación de la Cola
        Queue<String> cola = new ArrayDeque<>();

        //Adicionamos elementos a la cola
        cola.add("Messi");
        cola.add("Cristiano");
        cola.add("Mbapee");
        cola.add("James");

        //Mostramos los elementos de la cola
        System.out.println("Elementos dentro de la Cola: " + cola);

        //Mostrar la cabeza de la cola (primer elemento de la cola) --> element()
        System.out.println("Primer elemento de la cola: " + cola.element());

        //Agregar un elemento a la cola --> offer(E e)
        System.out.println("Se agregó un elemento a la cola?: " + cola.offer("Cuadrado"));

        //Mostramos los elementos de la cola
        System.out.println("Elementos dentro de la Cola: " + cola);

        //Mostrar la cabeza de la cola (primer elemento de la cola) --> peek() retorna "null" en caso de que la cola esté vacía
        System.out.println("Primer elemento de la cola: " + cola.peek());

        //Remover un elemento de la cola poll(), si la cola está vacía retorna "null"
        System.out.println("Elemento eliminado de la cola: " + cola.poll());
        
        //Remover un elemento de la cola remove()
        System.out.println("Elemento eliminado de la cola: " + cola.remove());

        //Mostramos los elementos de la cola
        System.out.println("Elementos dentro de la Cola: " + cola);

    }
}