package session09.lesson1;

import java.util.Scanner;

public class Student extends Person {
    private final String stuId;
    private double gpa;

    public Student(String stuId) {
        this.stuId = stuId;
    }

    public String getStuId() {
        return stuId;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public void input(Scanner sc) {
        System.out.print("Nhập điểm tổng kết: ");
        gpa = sc.nextDouble();
        sc.nextLine();
    }

    @Override
    public void display() {
        System.out.println("Thông tin của sinh viên");
        super.display();
        System.out.println("Mã sinh viên: " + stuId);
        System.out.println("Điểm tổng kết: " + gpa);
    }

    public static boolean checkStuId(String id) {
        return id.matches("SV\\d{5}");
    }
}

