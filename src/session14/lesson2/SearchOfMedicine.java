package lesson2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SearchOfMedicine {
    public static void main(String[] args) {
        Map<String,String> list = new HashMap<>();
        list.put("T01","Paracetamo");
        list.put("T02","Paracetamo1");
        list.put("T02","Paracetamo2");
        list.put("T03","Paracetamo3");
        list.put("T04","Paracetamo4");
        list.put("T05","Paracetamo5");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã thuốc: ");
        String input = sc.nextLine().toUpperCase();
        if(list.containsKey(input)){
            System.out.println("Thuốc "+ list.get(input));
        }else{
            System.out.println("Mã thuốc này không tồn tại");
        }
    }
}
