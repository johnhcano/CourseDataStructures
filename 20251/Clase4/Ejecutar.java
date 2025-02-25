public class Ejecutar {
    public static void main(String[] args) {

        Ejercicio20 objMatriz = new Ejercicio20();

        int[][] m = objMatriz.llenarMatriz(10, 10);

        System.out.println(objMatriz.mostrarMatriz(m));

        objMatriz.diagonalCerosMatriz(m);

        System.out.println(objMatriz.mostrarMatriz(m));

    }
}
