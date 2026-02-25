package ptit_demo;

import java.util.Scanner;

public class O00002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = Integer.parseInt(sc.nextLine().trim());

        while (t-- > 0) {
            String s = sc.nextLine().trim().toLowerCase();

            // Tách các từ (nhiều khoảng trắng -> 1)
            String[] words = s.split("\\s+");

            StringBuilder result = new StringBuilder();

            for (String w : words) {
                if (w.length() > 0) {
                    // Viết hoa chữ cái đầu
                    result.append(Character.toUpperCase(w.charAt(0)));
                    // Các chữ sau viết thường
                    if (w.length() > 1) {
                        result.append(w.substring(1));
                    }
                    result.append(" ");
                }
            }

            // In kết quả (bỏ dấu cách cuối)
            System.out.println(result.toString().trim());
        }
    }
}
