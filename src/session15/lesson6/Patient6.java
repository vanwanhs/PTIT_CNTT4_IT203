package lesson6;
public class Patient6 {
    private String id;
    private String name;
    private int age;
    private String gender;

    public Patient6(String id, String name, int age, String gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return id + " - " + name + " (" + age + ", " + gender + ")";
    }
}