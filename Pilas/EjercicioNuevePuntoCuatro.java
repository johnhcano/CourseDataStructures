
import java.util.Stack;
import java.util.Scanner;

public class EjercicioNuevePuntoCuatro {

    public static void main(String[] args) {

        /*
         * Análisis del problema 9.4 Pilas
         * Entradas:
         * Pilas -> pila1, pila2, pila3, pila4, pila5
         * (i,j) -> i->pila, j-> número
         * i <= abs(i) <= n
         * Proceso:
         * - Si la i es positivo inserta el número a la pila
         * - Si la i es negativa elimina un elemento de la pila
         * - si la i es 0 entonces termina programa
         * Salida:
         * Imprime el contenido de las n pilas por pantalla
         */

        Stack<Integer> pila1 = new Stack<>();
        Stack<Integer> pila2 = new Stack<>();
        Stack<Integer> pila3 = new Stack<>();
        Stack<Integer> pila4 = new Stack<>();
        Stack<Integer> pila5 = new Stack<>();

        int i = 0, j = 0;

        try (Scanner leer = new Scanner(System.in)) {

            boolean flag = true;

            while (flag) {
                System.out.print("i = ");
                i = leer.nextInt();
                
                switch (Math.abs(i)) {
                    
                    case 0:
                        System.exit(0);
                    
                    case 1:
                        if (i >= 1) {
                            System.out.print("j = ");
                            j = leer.nextInt();
                            pila1.push(j);
                        } else {
                                if(pila1.size() != 0){
                                    pila1.pop();
                                }
                            }
                        System.out.println("Pila 1 => " + pila1);
                        break;
                    
                    case 2:
                        if (i >= 1) {
                            System.out.print("j = ");
                            j = leer.nextInt();
                            pila2.push(j);
                        } else {
                            if(pila2.size() != 0){
                                pila2.pop();
                            }
                        }
                        System.out.println("Pila 2 => " + pila2);
                        break;

                    case 3:
                        if (i >= 1) {
                            System.out.print("j = ");
                            j = leer.nextInt();
                            pila3.push(j);
                        } else {
                            if(pila3.size() != 0){
                                pila3.pop();
                            }
                        }
                        System.out.println("Pila 3 => " + pila3);
                        break;

                    case 4:
                        if (i >= 1) {
                            System.out.print("j = ");
                            j = leer.nextInt();
                            pila4.push(j);
                        } else {
                            if(pila4.size() != 0){
                                pila4.pop();
                            }
                        }
                        System.out.println("Pila 4 => " + pila4);
                        break;

                    case 5:
                        if (i >= 1) {
                            System.out.print("j = ");
                            j = leer.nextInt();
                            pila5.push(j);
                        } else {
                            if(pila5.size() != 0){
                                pila5.pop();
                            }
                        }
                        System.out.println("Pila 5 => " + pila5);
                        break;

                    default:
                        System.out.println("Número incorrecto...");
                        break;
                }
            }
        }
    }
}
