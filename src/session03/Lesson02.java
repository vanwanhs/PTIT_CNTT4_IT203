package session03;

import java.util.Scanner;

public class Lesson02 {
    public static int searchBooks(String[] arr, String search) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equalsIgnoreCase(search)) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String[] books = {
                "Java Programming",
                "Clean Code",
                "Data Structures",
                "Operating Systems",
                "Computer Networks"
        };

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập tên sách cần tìm: ");
        String searchBook = sc.nextLine();
        int result = searchBooks(books, searchBook);

        if (result != -1) {
            System.out.println("Tìm thấy tại vị trí " + result);
        } else {
            System.out.println("Sách không tồn tại");
        }
    }
}
