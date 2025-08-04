import java.util.Random;

public class OperacionesArreglos {
    
    //Método para llenar un arreglo de enteros
    public int[] llenarArregloEnteros(int tam){

        Random rand = new Random();

        int[] numeros = new int[tam];

        for(int i = 0; i < numeros.length; i++){
            numeros[i] = rand.nextInt(100 - 1 ) + 1;            
        }

        return numeros;
    }
}
