package lesson2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class QuanLiThuoc {
    public static List<String> nhapDanhSachThuoc() {
        Scanner sc = new Scanner(System.in);
        List<String> ds = new ArrayList<>();

        System.out.print("Nhập số lượng thuốc: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập tên thuốc thứ " + (i + 1) + ": ");
            String tenThuoc = sc.nextLine();
            ds.add(tenThuoc);
        }
        return ds;
    }
    // Hàm lọc và trùng
    public static List<String> locVaSapXepThuoc(List<String> input) {
        List<String> result = new ArrayList<>();

        // Loại bỏ trùng lặp
        for (String thuoc : input) {
            if (!result.contains(thuoc)) {
                result.add(thuoc);
            }
        }

        // Sắp xếp A-Z
        Collections.sort(result);
        return result;
    }

    public static void main(String[] args) {

        // Nhập danh sách
        List<String> danhSachNhap = nhapDanhSachThuoc();
        System.out.println("Danh sách ban đầu: " + danhSachNhap);
        // Lọc
        List<String> danhSachThuoc = locVaSapXepThuoc(danhSachNhap);
        System.out.println("Danh sách sau khi xử lý: " + danhSachThuoc);
    }
}