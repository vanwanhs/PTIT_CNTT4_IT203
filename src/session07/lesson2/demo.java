package session07.lesson2;

public class demo {
    public static void main(String[] args) {
        int a = 10;
        int b = a;      // sao chép GIÁ TRỊ

        b = 20;

        System.out.println("Primitive:");
        System.out.println("a = " + a); // 10
        System.out.println("b = " + b); // 20

        // ===== BIẾN THAM CHIẾU =====
        Student s1 = new Student("An");
        Student s2 = s1;   // sao chép ĐỊA CHỈ

        s2.name = "Binh";

        System.out.println("\nReference:");
        System.out.println("s1.name = " + s1.name); // Binh
        System.out.println("s2.name = " + s2.name); // Binh
    }
//    Biến nguyên thủy (Primitive)
//    int a = 10;
//    int b = a;
//
//
//    b nhận bản sao giá trị của a
//
//    Thay đổi b không ảnh hưởng đến a
//
//    Dữ liệu lưu trực tiếp trong Stack
//
// Kết luận:
//
//    Primitive sao chép GIÁ TRỊ
//
// Biến tham chiếu (Reference)
//    Student s1 = new Student("An");
//    Student s2 = s1;
//
//
//    s1 và s2 cùng trỏ tới 1 object trong Heap
//
//    Thay đổi object qua s2 → s1 cũng bị ảnh hưởng
//
//    Stack lưu địa chỉ, Heap lưu đối tượng
//
// Kết luận:
//
//    Reference sao chép ĐỊA CHỈ
}
