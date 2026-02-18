public class EjecutarEstudiante {
    public static void main(String[] args) {
        //Creación de un objeto de la clase estudiante
        Estudiante objE = new Estudiante();

        //Arreglo de Objetos
        Estudiante[] est = new Estudiante[4];

        est[0] = new Estudiante("Juan", 3, "Ingeniería de Sistemas", 3.8, 20);
        est[1] = new Estudiante("Miguel", 4, "Ingeniería de Sistemas", 4.2, 19);
        est[2] = new Estudiante("Armando", 3, "Ingeniería de Sistemas", 3.0, 21);
        est[3] = new Estudiante("Milena", 3, "Ingeniería de Sistemas", 4.5, 20);
        
        System.out.println(est[2]);

        for (int i = 0; i < est.length; i++) {
            System.out.println(est[i].getNombre() + " --> " + est[i].getPrograma());        
        }

        //Promedio general de las notas de los estudiantes
        double sumaNota = 0.0;
        for (int i = 0; i < est.length; i++) {
            sumaNota += est[i].getNotaPromedio();        
        }
        System.out.println(sumaNota / est.length);

        //Almacenar en el arreglo edades la edad de los estudiantes
        int[] edades = new int[est.length];
        for (int i = 0; i < edades.length; i++) {
            edades[i] = est[i].getEdad();
        }

        //Uso del método calcularEdadPromedio
        System.out.println(objE.calcularEdadPromedio(edades));

        
    }    
}
