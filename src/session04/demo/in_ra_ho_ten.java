package session04.demo;

import java.util.Scanner;

public class in_ra_ho_ten {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Mời nhập họ tên đầy đủ của bạn: ");
        String fullName = sc.nextLine().trim();

        // Vị trí dấu cách đầu và cuối
        int firstSpace = fullName.indexOf(" ");
        int lastSpace = fullName.lastIndexOf(" ");

        // Tách họ, đệm, tên
        String ho = fullName.substring(0, firstSpace);
        String ten = fullName.substring(lastSpace + 1);
        String dem = fullName.substring(firstSpace + 1, lastSpace);

        // In kết quả
        System.out.println("Xin chào: " + fullName);
        System.out.println("Họ của bạn: " + ho);
        System.out.println("Đệm của bạn: " + dem);
        System.out.println("Tên của bạn: " + ten);
    }
}
