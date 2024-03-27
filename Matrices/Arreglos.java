public class Arreglos {

    public static void main(String[] args) {
        /*
        Arreglos enumerados 
        int[] n = {2, 5, 1, 9, 3};
        for (int i = 0; i < n.length; i++) {
            System.out.println("n["+i+"]="+n[i]);
        }
        System.out.println(Arrays.toString(n));
        */
        OperacionesConArrays objA = new OperacionesConArrays();
        
        int[] arr = new int[10];
        
        int[] res = objA.llenarArreglo(arr);
        
        objA.mostrarArreglo(res);
        
        System.out.println(objA.sumarArreglo(res));
        System.out.println(objA.sumarArregloFor(res));
        
        objA.mostrarArreglo(objA.mostrarPares(res));
    }
    
}

