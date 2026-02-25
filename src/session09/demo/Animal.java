package session09.demo;

import java.util.Scanner;

public class Animal {
    protected String animalName;
    protected int numberOfLegs;
    protected String furColor;
    protected double everageLifeExpectancy;

    public Animal() {}

    public Animal(String animalName, int numberOfLegs, String furColor, double everageLifeExpectancy) {
        this.animalName = animalName;
        this.numberOfLegs = numberOfLegs;
        this.furColor = furColor;
        this.everageLifeExpectancy = everageLifeExpectancy;
    }
    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    public double getEverageLifeExpectancy() {
        return everageLifeExpectancy;
    }

    public void setEverageLifeExpectancy(double everageLifeExpectancy) {
        this.everageLifeExpectancy = everageLifeExpectancy;
    }
    public void input(Scanner sc) {
        System.out.print("Nhập tên động vật: ");
        animalName = sc.nextLine();

        System.out.print("Nhập số chân: ");
        numberOfLegs = sc.nextInt();
        sc.nextLine();

        System.out.print("Nhập màu lông: ");
        furColor = sc.nextLine();

        System.out.print("Nhập tuổi thọ trung bình: ");
        everageLifeExpectancy = sc.nextDouble();
        sc.nextLine();
    }
    public void display() {
        System.out.println("Tên: " + animalName);
        System.out.println("Số chân: " + numberOfLegs);
        System.out.println("Màu lông: " + furColor);
        System.out.println("Tuổi thọ TB: " + everageLifeExpectancy);
    }
}
