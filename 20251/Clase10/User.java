import java.util.LinkedList;

public class User {
    
    private String id;
    private String name;
    // Loan history for the user (LinkedList is required by the task)
    private LinkedList<Loan> history = new LinkedList<>();

    public User(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LinkedList<Loan> getHistory() {
        return history;
    }

    @Override
    public String toString() {
        return id + " - " + name + " (Loans: " + history.size() + ")";
    }
}
