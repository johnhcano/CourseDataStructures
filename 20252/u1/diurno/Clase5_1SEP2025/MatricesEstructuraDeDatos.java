public class MatricesEstructuraDeDatos {

    public int[][] llenarMatrizEnteros(int filas, int columnas){
        int[][] m = new int[filas][columnas];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                m[i][j] = (int) ((Math.random() * (9 - 1) + 1)) + 1; 
            }
        }
        return m;
    }

    public String mostrarMatrizEnteros(int[][] m){
        String cad = "";
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                cad += m[i][j] + " "; 
            }
            cad += "\n";
        }
        return cad;
    }

}