import java.util.Arrays;

public class Ejecutar{
    public static void main(String[] args){
        //Arreglo que se va a evaluar
        //int[] A = {2,6,8,4,6,3,6,9};

        //OperacionesArreglos objOpArr = new OperacionesArreglos();

        //System.out.println(Arrays.toString(objOpArr.posicionesNumero(A, 6)));

        int[] A = {5, 12, 20, 8, 25, 30};

        System.out.println(Arrays.toString(A));

        //Creación del objeto que me permite acceder a la clase OperacionesArreglos
        OperacionesArreglos objArreglo = new OperacionesArreglos();

        objArreglo.mostrarArreglo(A);

        //probamos el método llenarArreglo con numeros enteros aleatorios

        int[] b = objArreglo.llenarArreglo(6, 1, 1000);

        objArreglo.mostrarArreglo(b);
        
    }
}