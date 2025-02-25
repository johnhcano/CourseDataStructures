public class Ejercicio20 {

    // Llenar la matriz con números enteros aleatorios
    public int[][] llenarMatriz(int n, int m) {
        int[][] matriz = new int[n][m];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = (int) (Math.random() * 9 + 0) + 0;
            }
        }
        return matriz;
    }

    //llenar con ceros la diagonal superior de una matriz
    public int[][] diagonalCerosMatriz(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                if(j >= i){
                    m[i][j] = 0;
                }
            }
        }
        return m;
    }

    //Mostrar la matriz
    public String mostrarMatriz(int[][] m) {
        String cad = "";
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                cad += m[i][j] + " ";           
            }
            cad += "\n";
        }
        return cad;
    }


}