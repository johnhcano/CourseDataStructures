import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapEnJava {
    public static void main(String[] args) {
        Map<Integer, String> estudiantes = new HashMap<>();

        estudiantes.put(1, "Miguel");
        estudiantes.put(2, "Guillermo");
        estudiantes.put(3, "Larry");
        estudiantes.put(4, "Daniela");
        estudiantes.put(5, "Martha");
        estudiantes.put(6, "Julian");

        // Imprimimos el Map con un Iterador
        Iterator it = estudiantes.keySet().iterator();
        while(it.hasNext()){
            Integer key = (Integer) it.next();
            System.out.println("Clave: " + key + " -> Valor: " + estudiantes.get(key));
        }
        
        System.out.println("Otra forma de recorrer los map");

        //Alternativa para recorrer los Map mostrando la Clave y el valor
        for (Entry<Integer, String> est : estudiantes.entrySet()){
	        Integer clave = est.getKey();
	        String valor = est.getValue();
	        System.out.println(clave+"  ->  "+valor);
        }
    }
}