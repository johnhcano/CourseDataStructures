import java.util.LinkedList;

public class User {
    private String id;
    private String name;
    private LinkedList<String> loanHistory = new LinkedList<String>();

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

    public void setName(String n) {
        this.name = n;
    }

    public LinkedList<String> getLoanHistory() {
        return loanHistory;
    }

    public String toString() {
        return "[id=" + id + ", name=" + name + ", history=" + loanHistory.size() + "]";
    }
}
