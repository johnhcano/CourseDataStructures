import java.util.Stack;

public class PilasColasU1 {
    public static void main(String[] args) {
        //Pilas en JAVA (Stack)
        //Se crea el objeto "pila" de tipo Stack
        Stack<Integer> pila = new Stack<>();
        
        //Se verifica si la pila está vacía
        System.out.println("La pila está vacía? " + pila.empty());

        //Se insertan 5 números enteros a la "pila"
        pila.push(10);
        pila.push(20);
        pila.push(5);
        pila.push(9);
        pila.push(35);

        //Se verifica si la pila está vacía
        System.out.println("La pila está vacía? " + pila.empty());

        //Se imprime la "pila"
        System.out.println(pila);

        //Se obtiene el elemento que se encuentra en el tope de la "pila" sin removerlo de la pila
        System.out.println(pila.peek());

        //Se remueve el último elemento de la "pila"
        pila.pop();

        //Se obtiene el elemento que se encuentra en el tope de la "pila" sin removerlo de la pila
        System.out.println(pila.peek());

        //Se imprime la "pila"
        System.out.println(pila);

        //Se obtiene la posición de cada elemento dentro de la "pila"
        System.out.println(pila.search(9));
        System.out.println(pila.search(5));
        System.out.println(pila.search(20));
        System.out.println(pila.search(10));

        //Buscamos un elemento que no esté dentro de la "pila", muestra -1 cuando no lo encuentra.
        System.out.println(pila.search(50));

    }
}