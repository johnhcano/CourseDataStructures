public class EjecutarMatrices {
    public static void main(String[] args) {
        
        MatricesEstructuraDeDatos objMatrices = new MatricesEstructuraDeDatos();

        int[][] m = objMatrices.llenarMatrizEnteros(3, 3);

        System.out.println(objMatrices.mostrarMatrizEnteros(m));

    }
}
