import java.util.Stack;

public class EjecutarPilaTrabajador {
    
    public static void main(String[] args) {
        
        Stack<Trabajador> trabajadores = new Stack<>();

        Trabajador t1 = new Trabajador("1234", "Juan", 2200.0);
        Trabajador t2 = new Trabajador("5678", "Pedro", 1200.0);
        Trabajador t3 = new Trabajador("9900", "Milena", 3200.0);

        trabajadores.push(t1);
        trabajadores.push(t2);
        trabajadores.push(t3);

        //System.out.println(trabajadores);
        
        System.out.println(trabajadores.size());

        double inc = 0.20; //incremento del salario en un 20%

        for(int i = 0; i < trabajadores.size(); i++){
            System.out.println("Nombre: " + trabajadores.elementAt(i).getNombre() + 
            "Salario inicial: " + trabajadores.elementAt(i).getSalario() + 
            "Salario final: " + trabajadores.elementAt(i).pagar(inc) + "\n");
        }
    }
}
