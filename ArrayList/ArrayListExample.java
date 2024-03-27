package ArrayList;

import java.util.*;
import java.io.*;

public class ArrayListExample {

    public static void main(String args[]) throws IOException {
        ArrayList<String> obj = new ArrayList<>();
        try (Scanner in = new Scanner(System.in)) {
            int c, ch;
            int i;
            String str;
            do {
                System.out.println("MANIPULACIÓN DE CADENAS");
                System.out.println("************************");
                System.out.println("1. Adicionar al final");
                System.out.println("2. Insertar en una posición particular");
                System.out.println("3. Buscar");
                System.out.println("4. Listar las cadenas que comienzan con la letra");
                System.out.println("5. Tamaño");
                System.out.println("6. Remover");
                System.out.println("7. Ordenar");
                System.out.println("8. Mostrar");
                System.out.println("Ingrese la opción");
                c = Integer.parseInt(in.next());
                switch (c) {

                    case 1: {
                        System.out.println("Digite la cadena ");
                        str = in.next();
                        obj.add(str);
                        break;
                    }
                    case 2: {
                        System.out.println("ingrese la pos");
                        i = in.nextInt();
                        System.out.println("ingrese cadena");
                        str = in.next();
                        obj.add(i, str);
                        break;
                    }
                    case 3: {
                        // codigo
                        break;
                    }
                    case 4: {
                        // codigo
                        break;
                    }
                    case 5: {
                        System.out.println("Tamao de la lista " + obj.size());
                        break;
                    }
                    case 6: {
                        // codigo
                        break;
                    }
                    case 7: {
                        // codigo
                        break;
                    }
                    case 8: {
                        System.out.println(obj);
                        break;
                    }
                }
                System.out.println("Por favor ingrese, 0 para salir, 1 para continuar");
                ch = Integer.parseInt(in.next());
            } while (ch == 1);
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}