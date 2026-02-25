package session06.lesson04;
public class Main {
    public static void main(String[] args) {
        // Dùng constructor không tham số
        Employee e1 = new Employee();

        // Dùng constructor có mã và tên
        Employee e2 = new Employee("NV01", "Nguyễn Văn A");

        // Dùng constructor đầy đủ
        Employee e3 = new Employee("NV02", "Trần Thị B", 15000000);

        System.out.println("Nhân viên 1:");
        e1.display();

        System.out.println("Nhân viên 2:");
        e2.display();

        System.out.println("Nhân viên 3:");
        e3.display();
    }
}
