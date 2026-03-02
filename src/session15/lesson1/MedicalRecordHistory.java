package lesson1;

import java.util.Stack;

public class MedicalRecordHistory {

    private Stack<EditAction> history = new Stack<>();

    // Thêm chỉnh sửa mới (push)
    public void addEdit(EditAction action) {
        history.push(action);
    }

    // Undo chỉnh sửa gần nhất (pop)
    public EditAction undoEdit() {
        if (history.isEmpty()) {
            System.out.println("Không có chỉnh sửa nào để undo!");
            return null;
        }
        return history.pop();
    }

    // Xem chỉnh sửa gần nhất (peek)
    public EditAction getLatestEdit() {
        if (history.isEmpty()) {
            System.out.println("Không có chỉnh sửa nào!");
            return null;
        }
        return history.peek();
    }

    // Kiểm tra stack rỗng
    public boolean isEmpty() {
        return history.isEmpty();
    }

    // Hiển thị toàn bộ lịch sử chỉnh sửa
    public void displayHistory() {
        if (history.isEmpty()) {
            System.out.println("Lịch sử chỉnh sửa trống!");
            return;
        }

        System.out.println("Danh sách chỉnh sửa (từ cũ → mới):");
        for (EditAction action : history) {
            System.out.println(action);
        }
    }
}
