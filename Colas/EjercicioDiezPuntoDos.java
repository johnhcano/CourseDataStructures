package Colas;

import java.util.ArrayDeque;
import java.util.Queue;

public class EjercicioDiezPuntoDos {
    public static void main(String[] args) {
        /*
        * Escribir un método que tenga como argumentos dos colas del mismo tipo 
        * y devuelva cierto si las dos colas son idénticas.
        */

        Queue<Integer> cola1 = new ArrayDeque<>();
        Queue<Integer> cola2 = new ArrayDeque<>();

        cola1.add(1);
        cola1.add(5);
        cola1.add(3);

        cola2.add(1);
        cola2.add(2);
        cola2.add(3);

        System.out.println("cola 1 --> " + cola1);
        System.out.println("cola 2 --> " + cola2);

        //System.out.println("Colas Iguales?: " + validarColasIdenticas(cola1, cola2));
        String msg = validarColasIdenticas(cola1, cola2) ? "Colas Iguales" : "Colas Diferentes";
        System.out.println(msg);
    
    }


    public static boolean validarColasIdenticas(Queue<Integer> c1, Queue<Integer> c2){
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
