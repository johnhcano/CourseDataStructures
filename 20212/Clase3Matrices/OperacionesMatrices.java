public class OperacionesMatrices {

    public void mostrarMatriz(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++){
                System.out.print(m[i][j] + " | ");
            }
            System.out.println();
        }
    }

    /*  Prueba de Escritorio (recorrido de la matriz)
        matriz m =>     6 | 4 | 1 |
                        8 | 2 | 9 |
                        3 | 5 | 7 |
    
        i   i < m.length    i++     j   j < m[0].length     j++     m[i][j]
        0   0 < 3 V                 0   0 < 3 V             1       m[0][0] => 6
                                        1 < 3 V             2       m[0][1] => 4
                                        2 < 3 V             3       m[0][2] => 1
                                        3 < 3 F
            1 < 3 V         1       0   0 < 3 V             1       m[1][0] => 8
                                        1 < 3 V             2       m[1][1] => 2
                                        2 < 3 V             3       m[1][2] => 9
                                        3 < 3 F
            2 < 3 V         2       0   0 < 3 V             1       m[2][0] => 3
                                        1 < 3 V             2       m[2][1] => 5
                                        2 < 3 V             3       m[2][2] => 7
                                        3 < 3 F
            3 < 3 F         3

    */

}