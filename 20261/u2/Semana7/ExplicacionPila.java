import java.util.Stack;

public class ExplicacionPila {
    public static void main(String[] args) {
        //Creación del objeto pila
        Stack<String> objPila =  new Stack<>();

        //Ingresar elementos a la pila
        objPila.push("Camilo");
        objPila.push("Daniela");
        objPila.push("Francisco");
        objPila.push("Andrea");
        objPila.push("Dario");

        //Mostrar los elementos de la pila
        System.out.println(objPila); //[Camilo, Daniela, Francisco, Andrea, Dario]

        //Mostrar sin remover el tope de la pila
        System.out.println("Tope de la pila: " + objPila.peek()); //Dario

        //Validar si la pila esta vacía
        System.out.println("Pila vacía: " + objPila.empty()); //false

        //Eliminar el elemento del tope de la pila
        System.out.println("Elemento removido:" + objPila.pop()); //Dario

        //Mostrar los elementos de la pila
        System.out.println(objPila); //[Camilo, Daniela, Francisco, Andrea]

        //Posiciones de los elementos con respecto al tope de la pila
        System.out.println("Posición: " + objPila.search("Camilo")); //4
        System.out.println("Posición: " + objPila.search("Daniela")); //3
        System.out.println("Posición: " + objPila.search("Francisco")); //2
        System.out.println("Posición: " + objPila.search("Andrea")); //1
    }    
}
