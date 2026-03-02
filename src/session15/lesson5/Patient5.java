package lesson5;

public class Patient5 {
    private String id;
    private String name;
    private int age;

    public Patient5(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Patient{id='" + id + "', name='" + name + "', age=" + age + "}";
    }
}