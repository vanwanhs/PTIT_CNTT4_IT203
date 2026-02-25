package session09.demo;

import java.util.Date;
import java.util.Scanner;

public class Bird extends Animal {
    private boolean isFly;
    private String birdSound;
    private Date birthday;

    public Bird() {
        super();
    }

    public Bird(String animalName, int numberOfLegs, String furColor,
                double everageLifeExpectancy, boolean isFly, String birdSound) {
        super(animalName, numberOfLegs, furColor, everageLifeExpectancy);
        this.isFly = isFly;
        this.birdSound = birdSound;
    }

    public boolean isFly() {
        return isFly;
    }

    public void setFly(boolean fly) {
        isFly = fly;
    }

    public String getBirdSound() {
        return birdSound;
    }

    public void setBirdSound(String birdSound) {
        this.birdSound = birdSound;
    }

    @Override
    public void input(Scanner sc) {
        super.input(sc);
        System.out.print("Chim có bay được không (true/false): ");
        isFly = sc.nextBoolean();
        sc.nextLine();
        System.out.println("Nhập tuổi: ");

        System.out.print("Tiếng hót của chim: ");
        birdSound = sc.nextLine();
    }
    @Override
    public void display() {
        super.display();
        System.out.println("Có bay được: " + (isFly ? "Có" : "Không"));
        System.out.println("Tiếng hót: " + birdSound);
    }
}
