package lesson4;

import java.util.LinkedList;
import java.util.Queue;

public class PatientQueue {

    private Queue<Patient> queue;

    // Constructor
    public PatientQueue() {
        queue = new LinkedList<>();
    }

    // Thêm bệnh nhân (enqueue)
    public void addPatient(Patient p) {
        queue.add(p);
    }

    // Gọi bệnh nhân đầu tiên (dequeue)
    public Patient callNextPatient() {
        if (queue.isEmpty()) {
            System.out.println("Không có bệnh nhân nào!");
            return null;
        }
        return queue.poll();
    }

    // Xem bệnh nhân tiếp theo (peek)
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

    // Hiển thị danh sách bệnh nhân đang chờ
    public void displayQueue() {
        if (queue.isEmpty()) {
            System.out.println("Danh sách chờ trống!");
            return;
        }

        System.out.println("Danh sách bệnh nhân đang chờ (FIFO):");
        for (Patient p : queue) {
            System.out.println(p);
        }
    }
}