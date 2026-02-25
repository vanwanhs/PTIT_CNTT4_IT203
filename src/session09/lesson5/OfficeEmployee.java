package session09.lesson5;

import java.util.Scanner;

public class OfficeEmployee extends Employee {
    private double baseSalary;

    @Override
    public void input(Scanner sc) {
        super.input(sc);
        System.out.print("Nhập lương cơ bản: ");
        baseSalary = sc.nextDouble();
        sc.nextLine();
    }

    @Override
    public double calculateSalary() {
        return baseSalary;
    }
}
