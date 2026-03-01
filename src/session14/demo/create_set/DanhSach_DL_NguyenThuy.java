package demo.create_set;

import javax.swing.text.html.HTMLDocument;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DanhSach_DL_NguyenThuy {
    public static void main(String[] args) {
        Set<Integer> list = new HashSet<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(5);
        System.out.println("Danh sách các phần tử không trùng lặp");
        System.out.println("\n Cách 1");
        for(Integer x : list){
            System.out.println(x);
        }
        System.out.println("\2 Cách 2");
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
