package session09.lesson1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String studentId;
        while (true) {
            System.out.print("Nhập mã sinh viên (SVxxxxx): ");
            studentId = sc.nextLine();

            if (Student.checkStuId(studentId)) {
                break;
            } else {
                System.out.println(" Mã sinh viên sai định dạng! Nhập lại.");
            }
        }

        Student st = new Student(studentId);
        st.input(sc);

        System.out.println("\n=== THÔNG TIN SINH VIÊN ===");
        st.display();
    }
}
