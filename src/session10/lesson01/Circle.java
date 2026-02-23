package session10.lesson01;

public class Circle implements Shape {

    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Override phương thức tính diện tích
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Override phương thức tính chu vi
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}