public class Ejecutar {
    public static void main(String[] args) {
        // Crear el objeto para acceder a la clase MetodosArreglos
        MetodosArreglos obj = new MetodosArreglos();

        String[] nombres = { "Alan", "Devora", "Miguel", "Sandra", "Diego" };
        int[] sueldos = { 100, 200, 150, 300, 100 };

        System.out.println(obj.nombresSueldos(nombres, sueldos));

    }
}