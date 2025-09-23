import java.util.ArrayDeque;
import java.util.Queue;

public class ColasU1 {
    public static void main(String[] args) {

        // 1) Crear una cola de enteros
        Queue<Integer> cola = new ArrayDeque<>();

        // 2) peek(): ver el frente sin eliminar; si está vacía retorna null
        System.out.println(cola.peek()); // null

        // 3) add()/offer(): insertar al final de la cola
        cola.add(5);
        cola.add(10);
        cola.add(3);
        cola.add(20);

        System.out.println(cola); // [5, 10, 3, 20]

        // 4) element(): ver el frente; lanza excepción si está vacía
        System.out.println(cola.element()); // 5

        // 5) offer() retorna boolean (true si inserta)
        System.out.println(cola.offer(9)); // true
        System.out.println(cola); // [5, 10, 3, 20, 9]

        // 6) peek(): ver el primero sin sacar
        System.out.println(cola.peek()); // 5

        // 7) poll(): obtiene y elimina el primero (o null si está vacía)
        System.out.println(cola.poll()); // 5
        System.out.println(cola); // [10, 3, 20, 9]

        // 8) size(): tamaño actual
        System.out.println("Tamaño de la cola: " + cola.size()); // 4

        // 9) remove(): elimina y retorna el primero (lanza excepción si está vacía)
        System.out.println(cola.remove()); // 10
        System.out.println(cola); // [3, 20, 9]

        // 10) clear(): vacía la estructura
        cola.clear();

        // 11) poll() en vacío => null
        System.out.println(cola.poll()); // null
    }
}