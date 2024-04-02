package Colas;

import java.util.ArrayDeque;
import java.util.Queue;

public class EjemploColas {
    public static void main(String[] args) {
        
        //Creación de la estructura Queue (Cola)
        Queue<Integer> cola = new ArrayDeque<>();

        //Insertamos elementos enteros a la cola con el método (add)
        cola.add(10);
        cola.add(5);
        cola.add(8);
        cola.add(16);
        cola.add(6);

        //Mostramos los elementos de la cola.
        System.out.println("Elementos de la cola: " + cola);

        //Mostrar la cabeza de la cola sin remover el elemento.
        System.out.println("Cabeza de la Cola: " + cola.element());

        //Agregar un elemento al final de la cola con el método (offer)
        cola.offer(20);

        //Mostramos los elementos de la cola.
        System.out.println("Elementos de la cola: " + cola);

        //Mostrar la cabeza de la cola sin remover el elemento de la cola 
        //y en caso de que la cola este vacía devolvera "null"
        System.out.println(cola.peek());

        //Remover la cabeza de la cola y en caso de que la cola este vacía devolvera "null"
        System.out.println(cola.poll());

        //Remover la cabeza de la cola
        System.out.println(cola.remove());

        //Mostramos los elementos de la cola.
        System.out.println("Elementos de la cola: " + cola);

        //Validar si la cola esta vacía (isEmpty)
        System.out.println("La cola esta vacía? " + cola.isEmpty());

        //Validar si se encuentra el elemento a buscar dentro de la cola
        int n = 10;
        System.out.println("El elemento " + n + " está dentro de la cola? " + cola.contains(n));
        
    }
}
