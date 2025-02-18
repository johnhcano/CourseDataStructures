import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {

        // Arreglos, arrays o vectores
        // Arreglos --> son estructuras de datos estáticas.
        // Una vez definido el tamaño no se puede modificar.
        // Almacena elementos de un mismo tipo de dato.

        // Forma 1 --> Declaración y asignación del arreglo
        int[] arr = { 22, 16, 3, 9 };

        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "]=" + arr[i]);
        }

        // Forma 2 --> Declaración del arreglo y posteriormente la asignación
        int[] arr1 = new int[4];
        arr1[0] = 22;
        arr1[1] = 16;
        arr1[2] = 3;
        arr1[3] = 9;

        for (int i = 0; i < arr1.length; i++) {
            System.out.println("arr1[" + i + "]=" + arr1[i]);
        }

        //Forma 3 --> Declaración del arreglo y asignación por medio de datos por teclado
        int[] arr2 = new int[4];

        //"for" para ingresar los valores del arreglo por teclado
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite número entero en la posición " + i));
        }

        for (int i = 0; i < arr2.length; i++) {
            System.out.println("arr2[" + i + "]=" + arr2[i]);
        }

        //---------------------------------------------------------------
        //Para trabajar con la clase "OperacionesConArreglos" se debe crear el objeto
        OperacionesConArreglos objOp = new OperacionesConArreglos();

        System.out.println("Arreglo --> " + objOp.mostrarArreglo(arr2));
        System.out.println("La suma del arreglo es: " + objOp.sumarArreglo(arr2));


    }
}