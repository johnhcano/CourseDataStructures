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

        //Mostrar la cabeza de la cola (primer elemento de la cola) --> peek()
        System.out.println("Primer elemento de la cola: " + cola.peek());

    }
}