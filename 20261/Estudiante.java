public class Estudiante {

    private String nombre;
    private int semestre;
    private String programa;
    private double notaPromedio;
    private int edad;
    
    public Estudiante(String nombre, int semestre, String programa, double notaPromedio, int edad) {
        this.nombre = nombre;
        this.semestre = semestre;
        this.programa = programa;
        this.notaPromedio = notaPromedio;
        this.edad = edad;
    }

    public Estudiante() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    public double getNotaPromedio() {
        return notaPromedio;
    }

    public void setNotaPromedio(double notaPromedio) {
        this.notaPromedio = notaPromedio;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double calcularEdadPromedio(int[] e){
        int suma = 0;
        for(int i = 0; i < e.length; i++){
            suma += e[i];
        }
        return suma / e.length;
    }

    @Override
    public String toString() {
        return "Estudiante [nombre=" + nombre + ", semestre=" + semestre + ", programa=" + programa + ", notaPromedio="
                + notaPromedio + ", edad=" + edad + "]";
    }

}
