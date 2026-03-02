package lesson5;

import java.util.LinkedList;
import java.util.Queue;

public class EmergencyCaseQueue {

    private Queue<EmergencyCase> cases;

    // Constructor
    public EmergencyCaseQueue() {
        cases = new LinkedList<>();
    }

    // Thêm ca cấp cứu vào Queue
    public void addCase(EmergencyCase c) {
        cases.add(c);
    }

    // Lấy ca cấp cứu tiếp theo (dequeue)
    public EmergencyCase getNextCase() {
        if (cases.isEmpty()) {
            System.out.println("Không còn ca cấp cứu nào!");
            return null;
        }
        return cases.poll();
    }
}