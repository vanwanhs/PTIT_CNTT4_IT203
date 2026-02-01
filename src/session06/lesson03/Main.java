package session06.lesson03;

public class Main {
    public static void main(String[] args) {
        Product p = new Product("SP01", "Laptop Dell", 15000000);

        System.out.println(" Thông tin ban đầu:");
        p.display();

        System.out.println("\n Thử set giá KHÔNG hợp lệ:");
        p.setPrice(-5000);

        System.out.println("\n Sau khi set giá:");
        p.display();
    }
}
