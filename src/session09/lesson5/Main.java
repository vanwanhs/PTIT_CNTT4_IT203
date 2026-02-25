package session09.lesson5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();

        System.out.print("Nhập số nhân viên: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Nhân viên văn phòng (1) hay sản xuất (2): ");
            int type = sc.nextInt();
            sc.nextLine();

            Employee e;

            if (type == 1) {
                e = new OfficeEmployee();
            } else {
                e = new ProductionEmployee();
            }

            e.input(sc);
            employees.add(e);
        }

        double totalSalary = 0;

        System.out.println("Danh sách lương nhân viên:");

        int index = 1;
        for (Employee e : employees) {
            double salary = e.calculateSalary();
            System.out.println(index + ". " + e.getName() + " - Lương: " + String.format("%,.0f", salary));
            totalSalary += salary;
            index++;
        }

        System.out.println("=> TỔNG LƯƠNG CÔNG TY: " + String.format("%,.0f", totalSalary));
    }
}
