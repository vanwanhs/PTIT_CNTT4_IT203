package lesson5;
import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    private static final PatientService service = new PatientService();

    private static void showMenu() {
        System.out.println("\n===== QUẢN LÝ BỆNH NHÂN =====");
        System.out.println("1. Tiếp nhận bệnh nhân");
        System.out.println("2. Cập nhật chẩn đoán");
        System.out.println("3. Xuất viện");
        System.out.println("4. Sắp xếp danh sách");
        System.out.println("5. Thoát");
        System.out.print("Chọn: ");
    }

    public static void main(String[] args) {
        while (true) {
            showMenu();
            String choice = sc.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("ID: ");
                    String id = sc.nextLine();
                    System.out.print("Họ tên: ");
                    String name = sc.nextLine();
                    System.out.print("Tuổi: ");
                    int age = Integer.parseInt(sc.nextLine());
                    System.out.print("Chẩn đoán: ");
                    String diagnosis = sc.nextLine();

                    boolean added = service.addPatient(
                            new Patient(id, name, age, diagnosis)
                    );

                    System.out.println(
                            added ? "Thêm thành công!" : "ID đã tồn tại!"
                    );
                    break;

                case "2":
                    System.out.print("Nhập ID: ");
                    String idUpdate = sc.nextLine();
                    System.out.print("Chẩn đoán mới: ");
                    String newDiag = sc.nextLine();

                    System.out.println(
                            service.updateDiagnosis(idUpdate, newDiag)
                                    ? "Cập nhật thành công!"
                                    : "Không tìm thấy bệnh nhân!"
                    );
                    break;

                case "3":
                    System.out.print("Nhập ID: ");
                    String idRemove = sc.nextLine();

                    System.out.println(
                            service.removePatient(idRemove)
                                    ? " Đã xuất viện!"
                                    : "Không tìm thấy bệnh nhân!"
                    );
                    break;

                case "4":
                    service.sortPatients();
                    System.out.println(" Danh sách bệnh nhân:");
                    for (Patient p : service.getPatients()) {
                        System.out.println(p);
                    }
                    break;

                case "5":
                    System.out.println(" Thoát chương trình!");
                    return;

                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }
}