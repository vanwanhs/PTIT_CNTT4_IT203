package session06.lesson02;

public class Main {
    public static void main(String[] args) {
        Account acc = new Account(
                "nguyenvana",
                "123456",
                "vana@gmail.com"
        );

        System.out.println("Thông tin ban đầu:");
        acc.display();

        acc.changePassword("newpassword789");

        System.out.println("Sau khi đổi mật khẩu:");
        acc.display();
    }
}
