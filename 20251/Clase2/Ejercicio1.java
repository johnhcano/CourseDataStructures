public class Ejercicio1 {
    public static void main(String[] args) {
        
        //Creación del objeto op de la clase OperacionesConArreglos
        OperacionesConArreglos op = new OperacionesConArreglos();
        /* 
        // Crear un arreglo de enteros
        int[] a = {10, 20, 33, 24, 15, 26, 67, 28, 9, 10};

        // Mostrar los elementos del arreglo
        System.out.println(op.mostrarElementos(a));
        System.out.println("La suma de los elementos del arreglo es: " + op.sumarElementos(a));
        System.out.println("El promedio de los elementos del arreglo es: " + op.promedioElementos(a));
        */

        int n = 5;
        int[] a = op.llenarArregloAleatorios(n);
        System.out.println(op.mostrarElementos(a));

        //Probando la generación de números aleatorios entre un rango de valores
        int min = -10;
        int max = 20;
        int randomNum = min + (int)(Math.random() * ((max - min) + 1));
        System.out.println("Número aleatorio generado entre " + min + " y " + max + ": " + randomNum);
    }
}