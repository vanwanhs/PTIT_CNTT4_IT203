package session03;

import java.util.Scanner;

public class Lesson01 {
    public static int[] addBookToLibraries(int n){
        Scanner sc = new Scanner(System.in);
        int[] books = new int[n];
        System.out.println("Nhap cac ma sach (ISBN):");
        for (int i = 0; i < n; i++){
            System.out.println("Ma sach thu " + (i+1) +": ");
            books[i] = sc.nextInt();
        }
        return books;
    }
    public static void disPlayLibraries(int[] arr){
        System.out.println("-- Result--");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
            if(i<arr.length-1){
                System.out.print(", ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong sach: ");
        int n = sc.nextInt();
        int[] bookList = addBookToLibraries(n);
        disPlayLibraries(bookList);
    }
}
