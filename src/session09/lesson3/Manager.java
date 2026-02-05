package session09.lesson3;

public class Manager extends Employee {
    private String department;
    public Manager(String name, double basicSalary, String department) {
        super(name, basicSalary);
        this.department = department;
    }

    public void displayFullInfo() {
        super.displayInfo();
        System.out.println("Phòng ban: " + department);
    }
}
