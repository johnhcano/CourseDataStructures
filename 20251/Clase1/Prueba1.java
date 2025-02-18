public class Prueba1 {

    public static void main(String[] args) {
        int[] a = { 4, 3, 4 };
        System.out.println(sumaParesImparesArreglo(a));
        System.out.println(sumaExtremosArreglo(a));
    }

    public static String sumaParesImparesArreglo(int[] a) {
        int sumaPares = 0, sumaImpares = 0;
        String cad = "";

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                sumaPares += a[i];
            } else {
                sumaImpares += a[i];
            }
        }

        cad = "La suma de los números pares = " + sumaPares + " suma de los números impares = " + sumaImpares;
        return cad;
    }

    public static String sumaExtremosArreglo(int[] a) {
        String cad = "";
        
        // Verificamos si el arreglo es par o impar
        if (a.length % 2 == 0) {
            // el arreglo es par
            for (int i = 0; i < a.length / 2; i++) {
                cad += (a[i] + (a[a.length - 1 - i])) + " ";
            }
        } else {
            // el arreglo es impar
            for (int i = 0; i < a.length / 2; i++) {
                cad += (a[i] + (a[a.length - 1 - i])) + " ";
            }
            cad += a[a.length / 2];
        }

        return cad;
    }
}