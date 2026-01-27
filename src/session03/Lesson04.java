package session03;

import java.util.Scanner;

public class Lesson04 {

    public static int deleteBook(int[] arr, int n, int bookId) {
        int pos = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] == bookId) {
                pos = i;
                break;
            }
        }

        if (pos == -1) {
            System.out.println("Không tìm thấy sách có id: " + bookId);
            return n;
        }

        for (int i = pos; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }

        System.out.println("Đã xóa sách thành công");
        return n - 1;
    }

    public static void displayBooks(int[] arr, int n) {
        if (n == 0) {
            System.out.println("Trong kho đang trống");
            return;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] books = {1, 2, 3, 4, 5, 6};
        int n = books.length;
        int choice = -1;

        do {
            System.out.println("\nDanh sách sách hiện tại:");
            displayBooks(books, n);
            System.out.print("Nhập id sách muốn xóa (0 để thoát): ");
            choice = sc.nextInt();
            if (choice != 0) {
                n = deleteBook(books, n, choice);
            }
        } while (choice != 0 && n > 0);

        System.out.println("Chương trình kết thúc.");
    }
}
