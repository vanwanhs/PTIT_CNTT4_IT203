package lesson6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PrescriptionService {

    private List<Medicine> medicines = new ArrayList<>();

    // Tìm thuốc theo ID
    private Medicine findById(String id) {
        for (Medicine m : medicines) {
            if (m.getDrugId().equals(id)) {
                return m;
            }
        }
        return null;
    }

    // 1. Thêm thuốc (cộng dồn số lượng)
    public void addMedicine(Medicine newMed) {
        Medicine existing = findById(newMed.getDrugId());

        if (existing != null) {
            existing.setQuantity(existing.getQuantity() + newMed.getQuantity());
            System.out.println(" Đã cộng dồn số lượng thuốc.");
        } else {
            medicines.add(newMed);
            System.out.println(" Đã thêm thuốc mới.");
        }
    }

    // 2. Điều chỉnh số lượng
    public boolean updateQuantity(String id, int newQty) {
        Medicine m = findById(id);
        if (m == null) return false;

        if (newQty == 0) {
            medicines.remove(m);
            System.out.println(" Thuốc đã bị xóa do số lượng = 0.");
        } else {
            m.setQuantity(newQty);
            System.out.println(" Đã cập nhật số lượng.");
        }
        return true;
    }

    // 3. Xóa thuốc
    public boolean removeMedicine(String id) {
        Medicine m = findById(id);
        if (m == null) return false;

        medicines.remove(m);
        return true;
    }

    // 4. In hóa đơn
    public void printInvoice() {
        if (medicines.isEmpty()) {
            System.out.println(" Đơn thuốc trống.");
            return;
        }

        double total = 0;
        System.out.println("\n===== HÓA ĐƠN THUỐC =====");
        System.out.printf("%-10s %-15s %-10s %-10s %-12s%n",
                "Mã", "Tên", "Giá", "SL", "Thành tiền");

        for (Medicine m : medicines) {
            System.out.printf("%-10s %-15s %-10.0f %-10d %-12.0f%n",
                    m.getDrugId(),
                    m.getDrugName(),
                    m.getUnitPrice(),
                    m.getQuantity(),
                    m.getTotalPrice());
            total += m.getTotalPrice();
        }

        System.out.println("------------------------------------------");
        System.out.println("TỔNG TIỀN: " + total + " VNĐ");

        medicines.clear(); // Xóa đơn sau khi in
        System.out.println(" Đã xóa đơn để chuẩn bị cho đơn mới.");
    }

    // 5. Tìm thuốc giá rẻ
    public void findCheapMedicines() {
        boolean found = false;
        for (Medicine m : medicines) {
            if (m.getUnitPrice() < 50000) {
                System.out.println(m.getDrugName() + " - " + m.getUnitPrice());
                found = true;
            }
        }
        if (!found) {
            System.out.println(" Không có thuốc giá dưới 50.000.");
        }
    }
}
