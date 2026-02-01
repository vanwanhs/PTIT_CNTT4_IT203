package session06.lesson05;
public class Book {
    private String id;
    private String title;
    private double price;

    // Constructor: tham số TRÙNG TÊN với thuộc tính
    public Book(String id, String title, double price) {
        this.id = id;
        this.title = title;
        this.price = price;
    }

    // Hiển thị thông tin sách
    public void display() {
        System.out.println("Mã sách: " + id);
        System.out.println("Tên sách: " + title);
        System.out.println("Giá: " + price);
        System.out.println("-------------------");
    }
}

