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
