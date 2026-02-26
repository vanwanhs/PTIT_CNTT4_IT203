package lesson1;

import java.util.ArrayList;
import java.util.Iterator;

public class SanLocThanNhiet {
    public static void main(String[] args) {
        ArrayList<Double> ds = new ArrayList<>();
        ds.add(36.5);
        ds.add(40.2);
        ds.add(37.0);
        ds.add(12.5);
        ds.add(39.8);
        ds.add(99.9);
        ds.add(36.8);
        System.out.println("Danh sách ban đầu: ");
        Iterator<Double> it = ds.iterator();
        while(it.hasNext()){
            double temp = it.next();
            if(temp < 34.0 || temp > 40){
                it.remove();
            }
        }
        System.out.println("Tính nhiệt độ trung bình sau khi lọc: ");
        double sum  = 0;
        for(Double x : ds){
            sum += x;
        }
        double avg = sum/ds.size();
        System.out.println("Nhiệt độ trung bình: " + avg);
    }
}
