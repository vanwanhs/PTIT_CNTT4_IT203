package lesson1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Paint {
    public static void main(String[] args) {
        Set <String> set = new LinkedHashSet<>();
        set.add("Nguyễn Văn A – Yên Bái");
        set.add("Nguyễn Văn B – Thái Bình");
        set.add("Nguyễn Văn A – Yên Bái");
        set.add("Phạm Thị Hồng Nhung – Nam Định");
        System.out.println("Danh sách sau khi thêm: ");
        Iterator<String> it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
