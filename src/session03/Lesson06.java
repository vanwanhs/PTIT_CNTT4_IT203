package session03;
import java.util.Arrays;

public class Lesson06 {

    public static int[] mergeBooks(int[] a, int[] b) {
        int i = 0, j = 0;
        int[] temp = new int[a.length + b.length];
        int k = 0;

        // Gộp 2 mảng
        while (i < a.length && j < b.length) {
            int value;
            if (a[i] < b[j]) {
                value = a[i++];
            } else if (a[i] > b[j]) {
                value = b[j++];
            } else {
                value = a[i];
                i++;
                j++;
            }

            // Loại trùng
            if (k == 0 || temp[k - 1] != value) {
                temp[k++] = value;
            }
        }

        // Phần còn lại của mảng a
        while (i < a.length) {
            if (k == 0 || temp[k - 1] != a[i]) {
                temp[k++] = a[i];
            }
            i++;
        }

        // Phần còn lại của mảng b
        while (j < b.length) {
            if (k == 0 || temp[k - 1] != b[j]) {
                temp[k++] = b[j];
            }
            j++;
        }

        // Cắt mảng đúng kích thước
        return Arrays.copyOf(temp, k);
    }

    public static void main(String[] args) {

        int[] arrayFirst  = {1, 3, 5, 7, 9};
        int[] arraySecond = {2, 3, 5, 6, 10};

        int[] arrayMerge = mergeBooks(arrayFirst, arraySecond);

        System.out.println("Danh sách sách hoàn chỉnh của thư viện:");
        for (int x : arrayMerge) {
            System.out.print(x + " ");
        }
    }
}
