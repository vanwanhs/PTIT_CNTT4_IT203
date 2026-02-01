package session06.lesson04;

public class Employee {
    private String id;
    private String name;
    private double salary;

    // 1. Constructor KHÔNG tham số
    public Employee() {
        this.id = "Chưa có";
        this.name = "Chưa có";
        this.salary = 0;
    }

    // 2. Constructor có mã và tên
    public Employee(String id, String name) {
        this.id = id;
        this.name = name;
        this.salary = 0;
    }

    // 3. Constructor đầy đủ mã, tên, lương
    public Employee(String id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Hiển thị thông tin nhân viên
    public void display() {
        System.out.println("Mã NV: " + id);
        System.out.println("Tên NV: " + name);
        System.out.println("Lương: " + salary);
        System.out.println("---------------------");
    }
}
