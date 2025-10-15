/**
 * Clase: Operation (Operación)
 * -------------------------------
 * Representa una acción que se guardará en la "pila de deshacer".
 * 
 * Por ejemplo:
 * - Si agregas un libro, aquí se guarda cómo eliminarlo si deshaces.
 * - Si prestas un libro, se guarda cómo devolverlo.
 *
 * Campos:
 *  - type: qué tipo de operación fue.
 *  - a, b, c: datos necesarios para poder revertirla después.
 *
 * En resumen:
 * - Sirve para recordar lo último que se hizo y poder revertirlo.
 */

 public class Operation {
    private OperationType type;
    private String a, b, c; // generic payload (A,B,C)

    public Operation(OperationType t, String a, String b, String c) {
        this.type = t;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public OperationType getType() {
        return type;
    }

    public String getA() {
        return a;
    }

    public String getB() {
        return b;
    }

    public String getC() {
        return c;
    }
}
