import java.util.Scanner;

public class Main16 {

    public static void main(String[] args) {

        InventoryManager<Pet> inventory = new InventoryManager<>();
        CustomerManager customerManager = new CustomerManager();
        SpaService spaService = new SpaService();
        ActionLogger logger = new ActionLogger();

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n PET KINGDOM ");
            System.out.println("1. Thêm thú cưng");
            System.out.println("2. Hiển thị kho");
            System.out.println("3. Đăng ký khách hàng");
            System.out.println("4. Spa - Thêm vào hàng đợi");
            System.out.println("5. Spa - Phục vụ tiếp");
            System.out.println("6. Undo thao tác");
            System.out.println("0. Thoát");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("ID: ");
                    String id = sc.nextLine();
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Species: ");
                    String species = sc.nextLine();
                    System.out.print("Price: ");
                    double price = sc.nextDouble();

                    Pet pet = new Pet(id, name, species, price);
                    if (inventory.add(pet)) {
                        logger.log("Added pet " + name);
                    };
                    break;

                case 2:
                    for (Pet p : inventory.getAll()) {
                        System.out.println(p);
                    }
                    break;

                case 3:
                    System.out.print("Customer ID: ");
                    String cid = sc.nextLine();
                    System.out.print("Name: ");
                    String cname = sc.nextLine();
                    System.out.print("Phone: ");
                    String phone = sc.nextLine();

                    if (customerManager.register(new Customer(cid, cname, phone))) {
                        logger.log("Registered customer " + cname);
                    }
                    break;

                case 4:
                    System.out.print("Pet ID to spa: ");
                    String spaId = sc.nextLine();
                    for (Pet p : inventory.getAll()) {
                        if (p.getId().equals(spaId)) {
                            spaService.addToQueue(p);
                            logger.log("Pet " + p.getName() + " added to spa queue");
                        }
                    }
                    break;
                case 5:
                    Pet served = spaService.serveNext();
                    if (served != null) {
                        System.out.println("Serving: " + served.getName());
                        logger.log("Served pet " + served.getName());
                    }
                    break;

                case 6:
                    System.out.println("Undo: " + logger.undo());
                    break;
            }

        } while (choice != 0);

        sc.close();
    }
}