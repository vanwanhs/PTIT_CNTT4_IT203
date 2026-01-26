package session02;

import java.util.Scanner;
public class Lesson01 {
    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);

        System.out.print("Nhập tuổi: ");
        int age = sc.nextInt();

        System.out.print("Nhập số sách đang mượn: ");
        int bookCount = sc.nextInt();

        if (age >= 18 && bookCount < 3) {
            System.out.println("Cho phép mượn sách");
        } else {
            if (age < 18) {
                System.out.println("Bạn chưa đủ tuổi");
            }
            if (bookCount >= 3) {
                System.out.println("Bạn đã mượn quá số lượng cho phép");
            }
        }
    }
}
