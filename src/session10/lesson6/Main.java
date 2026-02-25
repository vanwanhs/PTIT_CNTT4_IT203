package session10.lesson6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " - " + price;
    }
}

public class Main {

    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 1500));
        products.add(new Product("Mouse", 20));
        products.add(new Product("Keyboard", 50));
        products.add(new Product("Monitor", 300));


        // Sắp xếp theo giá tăng dần
        // Dùng Anonymous Class


        Collections.sort(products, new Comparator<Product>() {

            // Anonymous Class phù hợp khi:
            // - Cần viết nhiều logic phức tạp
            // - Cần thêm thuộc tính nội bộ
            // - Interface có nhiều hơn 1 abstract method (không phải functional interface)

            @Override
            public int compare(Product p1, Product p2) {
                return Double.compare(p1.getPrice(), p2.getPrice());
            }
        });

        System.out.println("=== Sắp xếp theo GIÁ tăng dần (Anonymous Class) ===");
        for (Product p : products) {
            System.out.println(p);
        }

        // Sắp xếp theo tên A-Z
        // Dùng Lambda Expression

        products.sort((p1, p2) -> p1.getName().compareTo(p2.getName()));

        System.out.println("\n=== Sắp xếp theo TÊN A-Z (Lambda) ===");
        products.forEach(p -> System.out.println(p));
    }
}