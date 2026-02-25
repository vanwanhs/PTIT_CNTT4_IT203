package session09.lesson5;

import java.util.Scanner;

public class ProductionEmployee extends Employee {
    private int numOfProducts;
    private double price;

    @Override
    public void input(Scanner sc) {
        super.input(sc);
        System.out.print("Nhập số sản phẩm: ");
        numOfProducts = sc.nextInt();
        System.out.print("Nhập đơn giá mỗi sản phẩm: ");
        price = sc.nextDouble();
        sc.nextLine();
    }

    @Override
    public double calculateSalary() {
        return numOfProducts * price;
    }
}
