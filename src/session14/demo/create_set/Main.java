package demo.create_set;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Student> students = new HashSet<>();

        students.add(new Student(1, "An", "Male", 20));
        students.add(new Student(2, "Binh", "Male", 21));
        students.add(new Student(1, "Lan", "Female", 22)); // trùng ID = 1

        System.out.println("Danh sách sinh viên trong Set:");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}