package session10.lesson02;
public abstract class Vehicle {

    protected String brand;

    // Constructor của lớp trừu tượng
    public Vehicle(String brand) {
        this.brand = brand;
    }

    // Phương thức trừu tượng
    public abstract void move();
}