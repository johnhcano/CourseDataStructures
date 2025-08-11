public class Estudiante {

    //Atributos de la clase
    private int id;
    private String nombre;
    private String apellido;
    private String facultad;


    //Constructor de la clase
    public Estudiante(int id, String nombre, String apellido, String facultad){
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.facultad = facultad;
    }

    public int getId(){
        return id;
    }

    public void matricularCursos(int id, String[] cursos){
        String cad = "";
        for(int i = 0; i < cursos.length; i++){
            cad += cursos[i] + " ";
        }
        System.out.println("id:" + id + "Cursos Matriculados: " + cad );
    }

    public String toString(){
        return "Estudiante { id: " + id + " Nombre: " + nombre + " Apellido: " + apellido + " Facultad: " + facultad + " }";
    } 

    //implementar el método +matricularCursos(id:int, cursos[]:String):void

    //implementar un método que permita saber cuántos estudiantes hay en cada facultad

    //implementar un método que permita saber cuantos estudiantes hay en cada curso.
    
}