package lesson4;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class DeSoCaBenh {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Cúm A");
        list.add("Sốt xuất huyết");
        list.add("Cúm A");
        list.add("Covid - 19");
        list.add("Cúm A");
        list.add("Cúm A");
        list.add("Sốt xuất huyết");
        Map<String, Integer> statistics = new TreeMap<>();
       for(String disease : list){
           if(statistics.containsKey(disease)){
               statistics.put(disease,statistics.get(disease)+ 1);
           } else {
               statistics.put(disease,1);
           }
       }
       for(Map.Entry<String, Integer> entry : statistics.entrySet()){
           System.out.println("Tên bệnh: "+ entry.getKey() + "Số lần xuất hiện" +entry.getKey());
       }
    }


}
