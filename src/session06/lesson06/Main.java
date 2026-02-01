package session06.lesson06;
public class Main {
    public static void main(String[] args) {
        System.out.println("User hợp lệ:");
        User u1 = new User("U01", "nguyenvana", "123456", "vana@gmail.com");
        u1.display();
        System.out.println("User email sai:");
        User u2 = new User("U02", "tranthib", "abcdef", "email-sai");
        u2.display();
        System.out.println("User password rỗng:");
        User u3 = new User("U03", "leminhc", "", "minh@gmail.com");
        u3.display();
    }
}
