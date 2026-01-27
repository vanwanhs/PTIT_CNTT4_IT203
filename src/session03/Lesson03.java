package session03;

import com.sun.security.jgss.GSSUtil;

import java.util.Random;
import java.util.Scanner;

public class Lesson03 {
    public static  void sortBooks(int[] arr){
        int n = arr.length;
        for(int i = 0; i<n-1;i++){
            for(int j = 0; j<n-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void displayBooks(int[] arr){
            for(int x: arr){
                System.out.print(x+ "\t");
            }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời bạn nhập số lượng phần tử của mảng: ");
        int n = sc.nextInt();
        Random r = new Random();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = r.nextInt(100);
        }
        System.out.println("Mảng trước khi sắp xếp");
        displayBooks(arr);
        System.out.println("Mảng sau khi sắp xếp");
        sortBooks(arr);
        displayBooks(arr);
    }
}
