package session06.lesson02;

import java.util.Scanner;

public class User {
    private int id;
    private String userName;
    private String password;
    private String email;

    public User(int id, String userName, String password, String email) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.email = email;
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập id: ");
        id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập user name");
        userName = sc.nextLine();
        System.out.println();
    }
}
