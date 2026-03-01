package lesson6;

import java.util.Set;
import java.util.TreeSet;

public class Main2 {
    public static void main(String[] args) {

        Set<Patient2> emergencyQueue =
                new TreeSet<>(new Patient2Comparator());

        // Input
        emergencyQueue.add(new Patient2("A", 3, 800));
        emergencyQueue.add(new Patient2("B", 1, 815));
        emergencyQueue.add(new Patient2("C", 1, 805));

        // Output
        System.out.println("Thứ tự xử lý:");
        for (Patient2 p : emergencyQueue) {
            System.out.println(p);
        }
    }
}