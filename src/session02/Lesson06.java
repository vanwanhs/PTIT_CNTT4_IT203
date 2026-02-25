package session02;

import java.util.Scanner;
public class Lesson06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int min = 0;
        int sum = 0;
        int count = 0;

        for (int i = 1; i <= 7; i++) {
            System.out.print("Nhập số lượt mượn sách ngày " + i + ": ");
            int borrow = sc.nextInt();

            if (borrow == 0) {
                continue; // bỏ qua ngày đóng cửa
            }

            if (count == 0) {
                // Ngày hợp lệ đầu tiên
                max = borrow;
                min = borrow;
            } else {
                if (borrow > max) {
                    max = borrow;
                }
                if (borrow < min) {
                    min = borrow;
                }
            }

            sum += borrow;
            count++;
        }

        if (count > 0) {
            double average = (double) sum / count;

            System.out.println("Lượt mượn cao nhất: " + max);
            System.out.println("Lượt mượn thấp nhất: " + min);
            System.out.println("Trung bình lượt mượn: " + average);
        } else {
            System.out.println("Không có ngày nào mở cửa trong tuần");
        }
    }
}
