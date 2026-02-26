package lesson4;
import java.util.LinkedList;

public class EmergencyRoom {
    private LinkedList<String> queue = new LinkedList<>();

    // Bệnh nhân thường → vào cuối hàng đợi
    public void patientCheckIn(String name) {
        queue.addLast(name);
    }

    // Ca cấp cứu → vào đầu hàng đợi
    public void emergencyCheckIn(String name) {
        queue.addFirst(name);
    }

    // Bác sĩ gọi bệnh nhân đầu tiên
    public void treatPatient() {
        if (queue.isEmpty()) {
            System.out.println("Không còn bệnh nhân chờ.");
            return;
        }

        String patient = queue.removeFirst();

        if (queue.size() >= 0) { // chỉ để phân biệt in thông báo
            System.out.println("Đang khám: " + patient);
        }
    }
}
