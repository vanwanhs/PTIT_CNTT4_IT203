package session07.lesson1;

public class Student {
    private int id;
    private String fullName;
    private static int totalStudent = 0;

    public Student(int id, String fullName) {
        this.id = id;
        this.fullName = fullName;
        totalStudent ++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public static int getTotalStudent() {
        return totalStudent;
    }

    public static void setTotalStudent(int totalStudent) {
        Student.totalStudent = totalStudent;
    }
    public void display(){
        System.out.println("Id: " + id);
        System.out.println("Name" + fullName);
    }
    public static void  showTotalStudent(){
        System.out.println("Tổng số học sinh: " + totalStudent);
    }
}
