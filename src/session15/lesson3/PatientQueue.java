package lesson3;
import java.util.LinkedList;
import java.util.Queue;

public class PatientQueue {

    private Queue<Patient> queue;

    // Constructor
    public PatientQueue() {
        queue = new LinkedList<>();
    }

    // Thêm bệnh nhân vào Queue (enqueue)
    public void addPatient(Patient p) {
        queue.add(p);
    }

    // Gọi bệnh nhân tiếp theo (dequeue)
    public Patient callNextPatient() {
        if (queue.isEmpty()) {
            System.out.println("Không có bệnh nhân nào đang chờ!");
            return null;
        }
        return queue.poll();
    }

    // Xem bệnh nhân tiếp theo sẽ được khám (peek)
    public Patient peekNextPatient() {
        if (queue.isEmpty()) {
            System.out.println("Không có bệnh nhân nào!");
            return null;
        }
        return queue.peek();
    }

    // Kiểm tra Queue rỗng
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    // Hiển thị danh sách bệnh nhân còn chờ
    public void displayQueue() {
        if (queue.isEmpty()) {
            System.out.println("Danh sách bệnh nhân chờ trống!");
            return;
        }

        System.out.println("Danh sách bệnh nhân đang chờ (FIFO):");
        for (Patient p : queue) {
            System.out.println(p);
        }
    }
}
