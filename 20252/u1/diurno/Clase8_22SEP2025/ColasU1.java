import java.util.ArrayDeque;
import java.util.Queue;

public class ColasU1 {
    public static void main(String[] args) {
        
        Queue<Integer> cola = new ArrayDeque<>();    

        System.out.println(cola.peek()); //null

        cola.add(5);
        cola.add(10);
        cola.add(3);
        cola.add(20);

        System.out.println(cola); //[5, 10, 3, 20]

        System.out.println(cola.element()); //5

        System.out.println(cola); //[5, 10, 3, 20]

        System.out.println(cola.offer(9)); //true

        System.out.println(cola); //[5, 10, 3, 20, 9]

        System.out.println(cola.peek()); //5

        System.out.println(cola.poll()); //[10, 3, 20, 9]

        System.out.println(cola.remove()); //[3, 20, 9]

        cola.clear(); //Borrar todos los elementos de la cola

        System.out.println(cola.poll()); //null

    }    
}
