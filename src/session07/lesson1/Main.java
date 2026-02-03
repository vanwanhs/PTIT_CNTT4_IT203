package session07.lesson1;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Nguyễn Văn Ánh" );
        Student s2 = new Student(2, "Nguyễn Văn Ánh1" );
        Student s3 = new Student(3, "Nguyễn Văn Ánh2" );
        Student s4 = new Student(4, "Nguyễn Văn Ánh3" );
        Student s5 = new Student(5, "Nguyễn Văn Ánh5" );
        s1.display();
        s2.display();
        s3.display();
        s4.display();
        s5.display();
        Student.showTotalStudent();
    }
}
