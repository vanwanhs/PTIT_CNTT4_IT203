package session09.demo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== NHẬP CHIM ===");
        Bird bird = new Bird();
        bird.input(sc);

        System.out.println("\n=== THÔNG TIN CHIM ===");
        bird.display();

    }
}
