import java.util.Arrays;

public class Ejecutar{
    public static void main(String[] args){
        //Arreglo que se va a evaluar
        int[] A = {2,6,8,4,6,3,8,6,9};

        OperacionesArreglos objOpArr = new OperacionesArreglos();

        System.out.println(Arrays.toString(objOpArr.posicionesNumero(A, 6)));
        
    }
}