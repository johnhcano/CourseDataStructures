import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class PracticaMapAndList {
    public static void main(String[] args) {
        
        LinkedList<String> historialNavegacion = new LinkedList<>();
        
        historialNavegacion.add("google.com");
        historialNavegacion.add("github.com");
        historialNavegacion.add("stackoverflow.com");
        
        System.out.println(historialNavegacion.getLast()); // Devuelve "stackoverflow.com"

        historialNavegacion.removeLast(); // Elimina "stackoverflow.com"

        System.out.println(historialNavegacion); // Devuelve "[google.com, github.com]"

        for (String pagina : historialNavegacion) {
            System.out.println(pagina);
        }

        //------------------------------------------------------------------------------

        Map<Integer, String> productos = new HashMap<>();    
        
        productos.put(101, "Laptop");
        productos.put(102, "Mouse");
        productos.put(103, "Teclado");

        System.out.println(productos); // Devuelve "{101=Laptop, 102=Mouse, 103=Teclado}"

        System.out.println(productos.containsKey(102)); // Devuelve true

        productos.put(101, "Pantalla"); // Actualiza el valor asociado a la clave 101

        System.out.println(productos);  // Devuelve "{101=Pantalla, 102=Mouse, 103=Teclado}"

        productos.forEach((key, value) -> {
            System.out.println("Código: [" + key + "] -> Producto: [" + value + "]");
        });

    }
}
