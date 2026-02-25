package session04;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lesson04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã thẻ thư viện: ");
        String maThe = sc.nextLine();
        String regex = "^[A-Z]{2}\\d{4}\\d{5}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(maThe);

        if (matcher.matches()) {
            System.out.println("Mã thẻ hợp lệ");
        } else {
            if (!maThe.startsWith("TV")) {
                System.out.println("Lỗi: Thiếu tiền tố TV");
            }
            else if (maThe.length() < 6 || !maThe.substring(2, 6).matches("\\d{4}")) {
                System.out.println("Lỗi: Năm không hợp lệ");
            }
            else if (maThe.length() < 11 || !maThe.substring(6).matches("\\d{5}")) {
                System.out.println("Lỗi: 5 chữ số cuối không hợp lệ");
            }
            else {
                System.out.println("Lỗi: Sai định dạng mã thẻ");
            }
        }
    }
}
