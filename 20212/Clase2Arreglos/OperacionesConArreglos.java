public class OperacionesConArreglos {
    
    //Mostrar el arreglo de enteros
    public String mostrarArreglo(int[] a){
        String cad = "";
        for(int i = 0; i < a.length; i++){
            cad += a[i] + " ";
        }
        return cad;
    }

    //Sumar los elementos del arreglo de enteros
    public int sumarArreglo(int[] a){
        int suma = 0;
        for(int i = 0; i < a.length; i++){
            suma += a[i];
        }
        return suma;
    }

}