package session03.mang_1_chieu;

import java.util.Random;
import java.util.Scanner;

public class DemSoLanXuatHien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        System.out.println("Mời bạn nhập số lượng phần tử ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = r.nextInt(10);
        }
        System.out.println("Phần tử trong mảng");
        for (int i = 0; i<n;i++){
            System.out.print(arr[i]+"\t");
            if((i+1)%20==0) System.out.println();
        }
        int[] count = new int[100];

        // Đếm số lần xuất hiện
        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }

        // In kết quả
        System.out.println("\nSố lần xuất hiện của các phần tử:");
        for (int i = 0; i < 100; i++) {
            if (count[i] > 0) {
                System.out.println(i + " xuất hiện " + count[i] + " lần");
            }
        }
    }
}
