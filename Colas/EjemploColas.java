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

        
    }
}
