package session02;
import java.util.Scanner;

public class Lesson03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số lượng sách trả muộn: ");
        int n = sc.nextInt();

        int total = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Nhập số ngày trễ của cuốn sách thứ " + i + ": ");
            int daysLate = sc.nextInt();

            total += daysLate * 5000;
        }

        System.out.println("Tổng số tiền phạt: " + total + " VNĐ");
    }
}
