package lesson5;

import java.util.Set;
import java.util.TreeSet;

public class Main1 {
    public static void main(String[] args) {

        Set<Patient1> emergencyQueue =
                new TreeSet<>(new Patient1Comparator());

        emergencyQueue.add(new Patient1("A", 3, 800));
        emergencyQueue.add(new Patient1("B", 1, 815));
        emergencyQueue.add(new Patient1("C", 1, 805));

        System.out.println("Thứ tự xử lý bệnh nhân:");
        for (Patient1 p : emergencyQueue) {
            System.out.println(p);
        }
    }
}