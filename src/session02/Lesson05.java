package session02;

import java.util.Scanner;

public class Lesson05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int score = 100;
        int daysLate;

        System.out.println("Nhập số ngày trễ mỗi lần trả sách (999 để kết thúc):");

        daysLate = sc.nextInt();

        while (daysLate != 999) {
            if (daysLate <= 0) {
                score += 5;
            } else {
                score -= daysLate * 2;
            }

            daysLate = sc.nextInt();
        }

        System.out.println("Tổng điểm uy tín: " + score);

        if (score > 120) {
            System.out.println("Xếp loại: Độc giả Thân thiết");
        } else if (score >= 80) {
            System.out.println("Xếp loại: Độc giả Tiêu chuẩn");
        } else {
            System.out.println("Xếp loại: Độc giả cần lưu ý");
        }
    }
}
