package lesson3;
import java.util.ArrayList;
import java.util.List;

public class QuanLiBenhNhan {
    public static <T> List<T> findCommonPatients(List<T> listA, List<T> listB) {
        List<T> result = new ArrayList<>();

        for (T item : listA) {
            if (listB.contains(item)) {
                result.add(item);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> khoaNoiInt = new ArrayList<>();
        khoaNoiInt.add(101);
        khoaNoiInt.add(102);
        khoaNoiInt.add(105);

        List<Integer> khoaNgoaiInt = new ArrayList<>();
        khoaNgoaiInt.add(102);
        khoaNgoaiInt.add(105);
        khoaNgoaiInt.add(108);

        List<Integer> ketQua1 = findCommonPatients(khoaNoiInt, khoaNgoaiInt);
        System.out.println("Test Case 1 Output: " + ketQua1);
        List<String> khoaNoiStr = new ArrayList<>();
        khoaNoiStr.add("DN01");
        khoaNoiStr.add("DN02");
        khoaNoiStr.add("DN03");

        List<String> khoaNgoaiStr = new ArrayList<>();
        khoaNgoaiStr.add("DN02");
        khoaNgoaiStr.add("DN04");

        List<String> ketQua2 = findCommonPatients(khoaNoiStr, khoaNgoaiStr);
        System.out.println("Test Case 2 Output: " + ketQua2);
    }
}