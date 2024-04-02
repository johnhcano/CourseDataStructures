package Colas;

import java.util.ArrayDeque;
import java.util.Queue;

public class EjercicioDiezPuntoUno {
    public static void main(String[] args) {
        /*
         * Escribir un programa en el que se generen 100 números aleatorios en el rango –25
            ... +25 y se guarden en una cola implementada mediante un array considerado
            circular. Una vez creada la cola, el usuario puede solicitar que se forme otra cola con
            los números negativos que tiene la cola original.
         */

         int n;

         Queue<Integer> colaAleatorios = new ArrayDeque<>();
         Queue<Integer> colaNegativos = new ArrayDeque<>();

         for(int i = 1; i <= 10; i++){
            n = (int) (Math.floor(Math.random()*((-25)-25+1)+25));
            colaAleatorios.add(n);
            if (n < 0){
                colaNegativos.add(n);
            }
         }

         System.out.println(colaAleatorios);
         System.out.println(colaNegativos);



    }
}
