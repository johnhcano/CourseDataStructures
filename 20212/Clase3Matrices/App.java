public class App {
    public static void main(String[] args)   {
        
        int[][] matriz1 ={ { 6, 4, 1 },
                            { 8, 2, 9 },
                            { 3, 5, 7 } };

        int[][] matriz2 ={ { 6, 4, 1, 4, 8},
                            { 8, 2, 9, 1, 7 },
                            { 3, 5, 7, 2, 6 } };


        OperacionesMatrices objMatriz = new OperacionesMatrices();

        objMatriz.mostrarMatriz(matriz1);
        System.out.println();
        objMatriz.mostrarMatriz(matriz2);
    }
}