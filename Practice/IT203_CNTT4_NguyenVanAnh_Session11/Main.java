import java.util.*;

public class Main {
    public static void main(String[] args) {

        ProductRepository repo = new ProductRepository();

        // Thêm sản phẩm
        repo.add(new ElectronicProduct("E01", "Laptop", 15000000, 24));
        repo.add(new ElectronicProduct("E02", "Tai nghe", 2000000, 6));
        repo.add(new FoodProduct("F01", "Bánh", 50000, 10));
        repo.add(new FoodProduct("F02", "Sữa", 30000, 5));

        // 1. Hiển thị toàn bộ danh sách
        System.out.println("===== DANH SÁCH SẢN PHẨM =====");
        for (Product p : repo.findAll()) {
            p.displayInfo();
            System.out.println("Thành tiền: " + p.calculateFinalPrice());
            System.out.println();
        }

        // 2. Tìm theo id
        System.out.println("===== TÌM SẢN PHẨM E01 =====");
        Product found = repo.findById("E01");
        if (found != null) {
            found.displayInfo();
        } else {
            System.out.println("Không tìm thấy!");
        }

        // 3. Sắp xếp theo giá tăng dần
        System.out.println("------Sắp xếp theo giá trị tăng dần ------");
        List<Product> sortedList = repo.findAll();

        Collections.sort(sortedList, Comparator.comparingDouble(Product::getPrice));

        for (Product p : sortedList) {
            System.out.println(p.getId() + " - Giá: " + p.getPrice());
        }

        // 4. Thống kê theo loại
        System.out.println("-------Thống kê phân loại: ");
        Map<String, Integer> stats = repo.countByType();
        for (String key : stats.keySet()) {
            System.out.println(key + ": " + stats.get(key));
        }
    }
}