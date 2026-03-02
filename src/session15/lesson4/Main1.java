package lesson4;
public class Main1 {
    public static void main(String[] args) {

        PatientQueue pq = new PatientQueue();

        pq.addPatient(new Patient("BN01", "Nguyễn Văn A", 30));
        pq.addPatient(new Patient("BN02", "Trần Thị B", 25));
        pq.addPatient(new Patient("BN03", "Lê Văn C", 40));

        pq.displayQueue();

        System.out.println("\nBệnh nhân tiếp theo:");
        System.out.println(pq.peekNextPatient());

        System.out.println("\nBác sĩ gọi khám:");
        System.out.println(pq.callNextPatient());

        System.out.println("\nDanh sách còn chờ:");
        pq.displayQueue();
    }
}