package demo.create_list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class DanhSachSo {
    public static void main(String[] args) {
        List<Integer> ds  = new ArrayList<>();
        ds.add(1);
        ds.add(2);
        ds.add(3);
        ds.add(4);
        System.out.println("Danh sách của bạn");
        System.out.println("Duyệt bằng chỉ số: ");
        for (int i = 0; i< ds.size();i++){
            System.out.println(ds.get(i));
        }
        System.out.println("Duyệt bằng for-each");
        for (Integer x : ds){
            System.out.println(x + " ");
        }
        System.out.println("Duyệt bằng iterator");
        Iterator<Integer> it = ds.iterator();
        while(it.hasNext()){
            System.out.println(it.next() +" ");

        }
        System.out.println("Duyệt bằng listIterator");
        ListIterator<Integer> lit = ds.listIterator();
        while (lit.hasNext()){
            System.out.println(lit.next() + "");
        }
    }
}
