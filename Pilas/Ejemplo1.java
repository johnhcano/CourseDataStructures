import java.util.Stack;

public class Ejemplo1 {

    /*
     * Escribir un programa que, haciendo uso de una Pila, procese cada uno de los
     * caracteres de una
     * expresión que viene dada en una línea. La finalidad es verificar el
     * equilibrio de paréntesis,
     * llaves y corchetes. Por ejemplo, la siguiente expresión tiene un número de
     * paréntesis equilibrado:
     * ((a+b)*5) - 7
     */

    public static void main(String[] args) {

        System.out.println(validarExpresion("\"{2*[(a+b)/2.5 + x - 7*y]}\""));
    }

    public static boolean validarExpresion(String expMat) {
        Stack<String> pila = new Stack<>();

        for (int i = 0; i < expMat.length(); i++) {
            pila.push(String.valueOf(expMat.charAt(i)));
        }
        System.out.println(pila);
        int pa = 0;// pa parentesis abriendo
        int pc = 0;// pc parentesis cerrando

        for (int i = 0; i < pila.size(); i++) {

            if (pila.elementAt(i).equals("(") || pila.elementAt(i).equals("{") || pila.elementAt(i).equals("[")) {
                pa += 1;
            } else if (pila.elementAt(i).equals(")") || pila.elementAt(i).equals("}")
                    || pila.elementAt(i).equals("]")) {
                pc += 1;
            }
        }

        return (pa == pc) ? true : false;
        // hacer el 9.4
    }
}