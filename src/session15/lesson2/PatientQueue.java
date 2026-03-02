package lesson2;

import java.util.LinkedList;
import java.util.Queue;

public class PatientQueue {

    private Queue<Patient> queue;

    // Constructor
    public PatientQueue() {
        queue = new LinkedList<>();
    }

    // Thêm bệnh nhân vào hàng đợi (enqueue)
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

    // Xem bệnh nhân sắp được khám (peek)
    public Patient peekNextPatient() {
        if (queue.isEmpty()) {
            System.out.println("Không có bệnh nhân nào!");
            return null;
        }
        return queue.peek();
    }

    // Kiểm tra queue rỗng
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