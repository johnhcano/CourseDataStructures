import java.util.Arrays;
import java.util.Random;

public class OperacionesConArrays {

    public int[] llenarArreglo(int a[]) {
        Random aleatorio = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = aleatorio.nextInt(50 - 1 + 1) + 1;
        }
        return a;
    }

    public void mostrarArreglo(int[] a) {
        System.out.println(Arrays.toString(a));
    }

    public int sumarArreglo(int[] a) {
        int total = 0;
        for (int i : a) {
            total += i;
        }
        return total;
    }

    public int sumarArregloFor(int[] a) {
        int total = 0;
        for (int i = 0; i < a.length; i++) {
            total += a[i];
        }
        return total;
    }

    public int[] mostrarPares(int[] a) {
        int c = 0;
        for (int i : a) {
            if (i % 2 == 0) {
                c += 1;
            }
        }
        int[] p = new int[c];
        int j = 0;
        for (int i : a) {
            if (i % 2 == 0) {
                p[j] = i;
                j++;
            }
        }
        return p;
    }
}