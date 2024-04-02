import java.util.ArrayDeque;
import java.util.Queue;

public class EjercicioDiezPuntoDos {
    public static void main(String[] args) {
        /*
        * Escribir un método que tenga como argumentos dos colas del mismo tipo 
        * y devuelva cierto si las dos colas son idénticas.
        */
    }

    public boolean validarColasIdenticas(Queue<Integer> c1, Queue<Integer> c2){
        boolean flag = false;
        int cabezaCola1 = 0;
        int cabezaCola2 = 0;
        for (int i = 1; i <= c1.size(); i++) {
            cabezaCola1 = c1.remove();
            cabezaCola2 = c2.remove();
            if(cabezaCola1 == cabezaCola2){
                flag = true;
            }else{
                flag = false;
                break; //System.exit(0);
            }
        }

        return flag;
    }


}
