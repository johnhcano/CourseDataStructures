import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

public class LinkedListMap {
    public static void main(String[] args) {
        
        LinkedList<String> historialNavegacion = new LinkedList<>();

        //Agregar las urls
        historialNavegacion.add("google.com");
        historialNavegacion.add("github.com");
        historialNavegacion.add("stackoverflow.com");

        System.out.println(historialNavegacion);

        System.out.println(historialNavegacion.getLast());

        historialNavegacion.removeLast();

        System.out.println(historialNavegacion);

        //---------------------------------------

        Map<Integer, String> productos = new LinkedHashMap<>();
        productos.put(101, "Laptop");
        productos.put(102, "Mouse");
        productos.put(103, "Teclado");

        System.out.println(productos);

        System.out.println(productos.containsKey(102)); //true
        
        productos.put(101, "Pantalla");

        System.out.println(productos);

        productos.forEach((key, value) -> {
            System.out.println("Código: [" + key + "] -> Producto: [" + value + "]");
        });
        
        //---------------Reto Final----------------

        



    }
}