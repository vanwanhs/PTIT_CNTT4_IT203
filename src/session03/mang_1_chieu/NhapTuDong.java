package session03.mang_1_chieu;

import java.util.Random;
import java.util.Scanner;

public class NhapTuDong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        int n;
        System.out.print("Nhập số n phần tử: ");
        n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = r.nextInt(31) + 10;
        }
        System.out.println("Mảng được sinh tự động:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "\t");
            if(i%25==0) System.out.println();
        }
    }
}
