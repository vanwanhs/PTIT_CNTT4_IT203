package session04;

import java.util.Scanner;

public class Lesson01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên sách: ");
        String tenSach = sc.nextLine();
        System.out.print("Nhập tên tác giả: ");
        String tacGia = sc.nextLine();
        System.out.print("Nhập thể loại: ");
        String theLoai = sc.nextLine();
        tenSach = tenSach.trim().replaceAll("\\s+", " ");
        tenSach = tenSach.toUpperCase();
        tacGia = tacGia.trim().toLowerCase().replaceAll("\\s+", " ");
        String[] words = tacGia.split(" ");
        StringBuilder tacGiaChuan = new StringBuilder();
        for (String word : words) {
            tacGiaChuan.append(word.substring(0, 1).toUpperCase())
                    .append(word.substring(1))
                    .append(" ");
        }
        System.out.println("[ " + tenSach +" ]" + " - Tác giả: " + tacGiaChuan.toString().trim());
    }
}
