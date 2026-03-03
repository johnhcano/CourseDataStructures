public class Matrices {
    public static void main(String[] args) {

        // Creación de la matriz forma1
        int[][] m1 = { { 9, 4, 1 },
                       { 2, 8, 7 },
                       { 3, 5, 6 } };

        // Creación de la matriz forma2
        /*
         * int[][] m2 = new int[3][3];
         * m2[0][0] = 9;
         * m2[0][1] = 4; ........
         */

        // Recorrer y mostrar los elementos de la matriz

        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[0].length; j++) {
                System.out.println("m1[" + i + "][" + j + "]=" + m1[i][j]);
            }
        }

        // Recorrer y mostrar los elementos de la matriz formato original
        String cad = "";
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[0].length; j++) {
                cad += m1[i][j] + " ";
            }
            cad+="\n";
        }
        System.out.println(cad);

        //Crear el objeto para acceder a la clase OperacionesMatrices
        OperacionesMatrices op = new OperacionesMatrices();
        int[][] m = op.llenarMatrizAleatoria(5, 5, 1, 9);
        System.out.println(op.mostrarMatriz(m));

    }
}
