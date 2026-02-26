package lesson6;
import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    private static final PrescriptionService service = new PrescriptionService();

    private static void showMenu() {
        System.out.println("\n===== KÊ ĐƠN THUỐC ĐIỆN TỬ =====");
        System.out.println("1. Thêm thuốc");
        System.out.println("2. Điều chỉnh số lượng");
        System.out.println("3. Xóa thuốc");
        System.out.println("4. In hóa đơn");
        System.out.println("5. Tìm thuốc giá rẻ");
        System.out.println("6. Thoát");
        System.out.print("Chọn: ");
    }

    public static void main(String[] args) {
        while (true) {
            showMenu();
            String choice = sc.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Mã thuốc: ");
                    String id = sc.nextLine();
                    System.out.print("Tên thuốc: ");
                    String name = sc.nextLine();
                    System.out.print("Đơn giá: ");
                    double price = Double.parseDouble(sc.nextLine());
                    System.out.print("Số lượng: ");
                    int qty = Integer.parseInt(sc.nextLine());

                    service.addMedicine(new Medicine(id, name, price, qty));
                    break;

                case "2":
                    System.out.print("Nhập mã thuốc: ");
                    String idUpdate = sc.nextLine();
                    System.out.print("Số lượng mới: ");
                    int newQty = Integer.parseInt(sc.nextLine());

                    if (!service.updateQuantity(idUpdate, newQty)) {
                        System.out.println("Không tìm thấy thuốc, vui lòng nhập lại!");
                    }
                    break;

                case "3":
                    System.out.print("Nhập mã thuốc cần xóa: ");
                    String idRemove = sc.nextLine();

                    if (!service.removeMedicine(idRemove)) {
                        System.out.println(" Thuốc không tồn tại!");
                    } else {
                        System.out.println(" Đã xóa thuốc.");
                    }
                    break;

                case "4":
                    service.printInvoice();
                    break;

                case "5":
                    service.findCheapMedicines();
                    break;

                case "6":
                    System.out.println("Kết thúc chương trình.");
                    return;

                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }
}