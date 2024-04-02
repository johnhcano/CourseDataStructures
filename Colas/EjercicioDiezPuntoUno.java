package Colas;

import java.util.Random;

public class EjercicioDiezPuntoUno {
    public static void main(String[] args) {
        /*
         * Escribir un programa en el que se generen 100 números aleatorios en el rango –25
            ... +25 y se guarden en una cola implementada mediante un array considerado
            circular. Una vez creada la cola, el usuario puede solicitar que se forme otra cola con
            los números negativos que tiene la cola original.
         */

         Random aleatorio = new Random();
         int n = aleatorio.nextInt(-25 - 25 + 1) + 25;
         System.out.println(n);

    }
}
