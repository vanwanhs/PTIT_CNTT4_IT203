package session10.lesson5;

public class Main {

    public static void main(String[] args) {

        Employee staff = new OfficeStaff("Lan", 8000000);
        Employee manager = new Manager("Hùng", 15000000, 5000000);


        System.out.println("Nhân viên: " + staff.getName());
        System.out.println("Lương cơ bản: " + staff.getBaseSalary());
        System.out.println("Lương thực nhận: " + staff.calculateSalary());
        System.out.println();

        System.out.println("Nhân viên: " + manager.getName());
        System.out.println("Lương cơ bản: " + manager.getBaseSalary());
        System.out.println("Thưởng KPI: " + ((Manager) manager).getBonus());
        System.out.println("Lương thực nhận: " + manager.calculateSalary());
    }
}