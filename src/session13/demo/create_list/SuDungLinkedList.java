package demo.create_list;

import java.util.ArrayList;
import java.util.List;

public class SuDungLinkedList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Cường");
        list.add("Hồng");
        list.add("Nhung");
        System.out.println("Danh sách ");
        for (String x : list){
            System.out.println(x +" ");
        }
    }
}
