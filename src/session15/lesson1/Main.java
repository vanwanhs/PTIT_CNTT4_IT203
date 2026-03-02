package lesson1;

public class Main {
    public static void main(String[] args) {

        MedicalRecordHistory history = new MedicalRecordHistory();

        history.addEdit(new EditAction("Cập nhật chẩn đoán", "09:00"));
        history.addEdit(new EditAction("Thêm đơn thuốc", "09:15"));
        history.addEdit(new EditAction("Sửa thông tin bệnh nhân", "09:30"));

        // Hiển thị lịch sử
        history.displayHistory();

        // Xem chỉnh sửa gần nhất
        System.out.println("Chỉnh sửa gần nhất:");
        System.out.println(history.getLatestEdit());

        // Undo
        System.out.println("Undo chỉnh sửa:");
        System.out.println(history.undoEdit());

        // Hiển thị lại
        history.displayHistory();
    }
}