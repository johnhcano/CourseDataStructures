public class Loan {
    public String userId;
    public String isbn;
    public boolean returned;

    public Loan(String userId, String isbn) {
        this.userId = userId;
        this.isbn = isbn;
        this.returned = false;
    }

    @Override
    public String toString() {
        return "Loan{user=" + userId + ", isbn=" + isbn +
                ", returned=" + (returned ? "yes" : "no") + "}";
    }
}
