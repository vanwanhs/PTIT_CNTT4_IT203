package session10.lesson01;

public class Main {
    public static void main(String[] args) {

        // Tạo đối tượng hình tròn
        Shape circle = new Circle(5);

        // Tạo đối tượng hình chữ nhật
        Shape rectangle = new Rectangle(4, 6);

        // In kết quả
        System.out.println("HÌNH TRÒN");
        System.out.println("Diện tích: " + circle.getArea());
        System.out.println("Chu vi: " + circle.getPerimeter());

        System.out.println();

        System.out.println("HÌNH CHỮ NHẬT");
        System.out.println("Diện tích: " + rectangle.getArea());
        System.out.println("Chu vi: " + rectangle.getPerimeter());
    }
}