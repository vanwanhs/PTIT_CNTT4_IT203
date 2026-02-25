package session06.lesson03;

public class Product {
    // Thuộc tính private (đóng gói)
    private String productId;
    private String productName;
    private double price;

    // Constructor
    public Product(String productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        setPrice(price); // dùng setter để kiểm soát
    }

    // Getter
    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    // Setter có kiểm tra
    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("❌ Giá không hợp lệ! Giá phải > 0");
        }
    }

    // Hiển thị thông tin sản phẩm
    public void display() {
        System.out.println("Mã SP: " + productId);
        System.out.println("Tên SP: " + productName);
        System.out.println("Giá bán: " + price);
    }
}

