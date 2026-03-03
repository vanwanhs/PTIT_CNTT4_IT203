import java.util.ArrayList;
import java.util.List;

public class InventoryManager<T> {

    private List<T> items = new ArrayList<>();

    public boolean add(T item) {

        if (item instanceof Pet) {

            Pet newPet = (Pet) item;

            for (T existingItem : items) {

                if (existingItem instanceof Pet) {

                    Pet existingPet = (Pet) existingItem;

                    if (existingPet.getId().equals(newPet.getId())) {
                        System.out.println("Pet ID already exists!");
                        return false;
                    }
                }
            }
        }

        items.add(item);
        System.out.println("Added successfully!");
        return true;
    }

    public void remove(T item) {
        items.remove(item);
    }

    public List<T> getAll() {
        return items;
    }
}