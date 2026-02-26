package lesson4;

public class Main {
    public static void main(String[] args) {

        EmergencyRoom er = new EmergencyRoom();

        // Mô phỏng theo đề bài
        er.patientCheckIn("A");
        er.patientCheckIn("B");
        er.emergencyCheckIn("C");

        // Bác sĩ điều trị lần lượt
        System.out.println("Đang cấp cứu: C");
        er.treatPatient(); // A
        er.treatPatient(); // B
    }
}
