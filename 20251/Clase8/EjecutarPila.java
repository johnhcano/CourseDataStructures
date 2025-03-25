import java.util.Stack;

public class EjecutarPila {
    public static void main(String[] args) {

        //Creación de la estructura Stack (Pila)
        Stack<String> nombres =  new Stack<>();
        
        System.out.println(nombres.empty()); //true
        
        //insertar elementos en la pila
        nombres.push("Pedro");
        nombres.push("Juan");
        nombres.push("María");
        nombres.push("Camila");
        nombres.push("Daniel");

        //Imprimir la pila
        System.out.println(nombres); //[Pedro, Juan, María, Camila, Daniel]

        //Mostrar quién está en el tope de la pila (sin removerlo) --> Consultar
        System.out.println(nombres.peek()); //Daniel

        //Buscar un elemento dentro de la Pila
        System.out.println(nombres.search("Camila")); //2

        //Retirar un elemento de la pila
        System.out.println(nombres.pop());

        //Imprimir la pila
        System.out.println(nombres); //[Pedro, Juan, María, Camila]

        //Verificar el tamaño de la pila
        System.out.println(nombres.size()); //4

        
    }
}