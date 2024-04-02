package Colas;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class EjemploColas {
    public static void main(String[] args) {
        
        Queue<Integer> cola = new ArrayDeque<>();

        cola.add(10);
        cola.add(5);
        cola.add(8);
        cola.add(16);
        cola.add(6);

        System.out.println("Elementos de la cola: " + cola);

    }
}
