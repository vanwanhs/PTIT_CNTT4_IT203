
import java.util.HashMap;
import java.util.Map;

public class CustomerManager {

    private Map<String, Customer> customers = new HashMap<>();
    public boolean register(Customer customer) {

        if (customers.containsKey(customer.getId())) {
            System.out.println("Customer ID already exists!");
            return false;
        }

        customers.put(customer.getId(), customer);
        System.out.println("Customer registered successfully!");
        return true;
    }

    public Customer findById(String id) {
        return customers.get(id);
    }

    public void displayAll() {
        customers.values().forEach(System.out::println);
    }
}