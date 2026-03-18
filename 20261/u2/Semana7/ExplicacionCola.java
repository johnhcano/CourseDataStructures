import java.util.LinkedList;
import java.util.Queue;

public class ExplicacionCola {
    public static void main(String[] args) {
        
        Queue<Integer> objCola = new LinkedList<>();

        //Agregar elementos a la cola (add(e), offer(e))
        objCola.add(29);
        objCola.add(16);
        objCola.offer(10);
        objCola.offer(34);

        //Mostrar los elementos de la cola
        System.out.println(objCola); //[29, 16, 10, 34]

        //Mostrar la cabeza de la cola (element(), peek())
        System.out.println("Cabeza de cola (element): " + objCola.element()); //29
        System.out.println("Cabeza de cola (peek): " + objCola.peek()); //29

        //Eliminar de la cabeza de cola (poll(), remove())
        System.out.println("Elemento eliminado con poll() : " + objCola.poll()); //29
        System.out.println("Elemento eliminado con remove() : " + objCola.remove()); //16
        
        //Mostrar los elementos de la cola
        System.out.println(objCola); //[10, 34]

        //Mostrar el tamaño de la cola con el método size()
        System.out.println("Tamaño de la cola: " + objCola.size()); //2
    }
}
