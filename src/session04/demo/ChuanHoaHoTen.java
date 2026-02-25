package session04.demo;

import java.util.Scanner;

public class ChuanHoaHoTen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập họ tên: ");
        String fullName = sc.nextLine();

        // B1: Xóa khoảng trắng dư, đưa về chữ thường
        fullName = fullName.trim().toLowerCase();

        // B2: Tách từng từ
        String[] words = fullName.split("\\s+");

        StringBuilder result = new StringBuilder();

        // B3: Viết hoa chữ cái đầu mỗi từ
        for (String word : words) {
            String firstChar = word.substring(0, 1).toUpperCase();
            String rest = word.substring(1);
            result.append(firstChar).append(rest).append(" ");
        }

        // B4: In kết quả
        System.out.println("Tên sau khi chuẩn hóa: " + result.toString().trim());
    }
}
