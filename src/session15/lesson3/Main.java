package lesson3;
public class Main {
    public static void main(String[] args) {

        PatientQueue patientQueue = new PatientQueue();

        // Thêm bệnh nhân
        patientQueue.addPatient(new Patient("BN01", "Nguyễn Văn A", 30));
        patientQueue.addPatient(new Patient("BN02", "Trần Thị B", 25));
        patientQueue.addPatient(new Patient("BN03", "Lê Văn C", 40));

        // Hiển thị danh sách chờ
        patientQueue.displayQueue();

        // Xem bệnh nhân tiếp theo
        System.out.println("\nBệnh nhân tiếp theo sẽ được khám:");
        System.out.println(patientQueue.peekNextPatient());

        // Gọi khám
        System.out.println("\nBác sĩ gọi khám:");
        System.out.println(patientQueue.callNextPatient());

        // Danh sách còn lại
        System.out.println("\nDanh sách bệnh nhân còn chờ:");
        patientQueue.displayQueue();
    }
}