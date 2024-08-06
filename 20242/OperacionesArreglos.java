public class OperacionesArreglos {

    public int[] posicionesNumero(int[] a, int x){
        int cantidadNumeroRepetido = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i] == x){
                cantidadNumeroRepetido+=1; // cantidadNumeroRepetido++; ó cantidadNumeroRepetido = cantidadNumeroRepetido + 1; 
            }
        }
        
        int[] resultado = new int[cantidadNumeroRepetido];
        int pos = 0; 
        for(int i = 0; i < a.length; i++){  
            if(a[i] == x){
                resultado[pos] = i;
                pos++;
            }   
        }
        return resultado;
    }
}