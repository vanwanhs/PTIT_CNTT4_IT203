package session09.lesson5;

import java.util.Scanner;

public abstract class Employee {
    protected String name;

    public void input(Scanner sc) {
        System.out.print("Nhập tên nhân viên: ");
        name = sc.nextLine();
    }

    public String getName() {
        return name;
    }

    public abstract double calculateSalary();
}
