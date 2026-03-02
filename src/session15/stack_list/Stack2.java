package stack_list;

import java.util.ArrayList;
import java.util.List;

public class Stack2 {

    // Inner class Stack
    public class Stack<T> {

        private List<T> list;

        // Constructor
        public Stack() {
            list = new ArrayList<>();
        }

        // Thêm phần tử vào Stack (push)
        public void push(T object) {
            list.add(object);
        }

        // Lấy và xóa phần tử trên đỉnh Stack (pop)
        public T pop() {
            if (isEmpty()) {
                System.out.println("Stack rỗng, không thể pop!");
                return null;
            }
            return list.remove(list.size() - 1);
        }

        // Xem phần tử trên đỉnh Stack (peek)
        public T peek() {
            if (isEmpty()) {
                System.out.println("Stack rỗng!");
                return null;
            }
            return list.get(list.size() - 1);
        }

        // Kiểm tra Stack có rỗng không
        public boolean isEmpty() {
            return list.isEmpty();
        }

        // Lấy số phần tử trong Stack
        public int size() {
            return list.size();
        }

        // Hiển thị toàn bộ Stack
        public void display() {
            if (isEmpty()) {
                System.out.println("Stack rỗng!");
                return;
            }

            System.out.println("Stack (từ đáy → đỉnh):");
            for (T item : list) {
                System.out.println(item);
            }
        }
    }
}