package session04.demo;

import java.util.StringTokenizer;

public class TachChuoi_StringTokenizer {
    public static void main(String[] args) {
        String name = "Tách   chuỗi bảng    phương thức split()";
        StringTokenizer stk = new StringTokenizer(name);
        while (stk.hasMoreElements()){
            System.out.println(stk.nextToken());
        }

        String str1 = "Monday";
        String str2 = "Tuesday";
        System.out.println(str1.compareTo(str2));
    }

}
