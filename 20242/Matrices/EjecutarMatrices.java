public class EjecutarMatrices {
    public static void main(String[] args) {
        String cadPares = "", cadImpares = "";

        int[][] m = { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 } };

        // Mostrar la matriz
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                if (m[i][j] % 2 == 0) {
                    cadPares += m[i][j] + " ";
                } else {
                    cadImpares += m[i][j] + " ";
                }
            }
        }
        System.out.println("Pares: " + cadPares + "Impares: " + cadImpares);
    }
}