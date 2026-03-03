import java.util.Stack;

public class ActionLogger {

    private Stack<String> logs = new Stack<>();

    public void log(String action) {
        logs.push(action);
    }

    public String undo() {
        if (logs.isEmpty())
            return "No action to undo";
        return logs.pop();
    }

    public void displayRecent() {
        logs.forEach(System.out::println);
    }
}