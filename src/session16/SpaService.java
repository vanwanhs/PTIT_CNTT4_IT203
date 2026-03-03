import java.util.LinkedList;
import java.util.Queue;

public class SpaService {
    private Queue<Pet> spaQueue = new LinkedList<>();

    public void addToQueue(Pet pet) {

        if (pet == null) {
            System.out.println("Pet does not exist!");
            return;
        }

        spaQueue.offer(pet); // thêm vào cuối hàng
        System.out.println(pet.getName() + " added to spa queue.");
    }

    public Pet serveNext() {

        if (spaQueue.isEmpty()) {
            System.out.println("Spa queue is empty!");
            return null;
        }

        Pet servedPet = spaQueue.poll(); // lấy và xóa phần tử đầu
        System.out.println("Serving: " + servedPet.getName());
        return servedPet;
    }
    public void displayQueue() {

        if (spaQueue.isEmpty()) {
            System.out.println("Spa queue is empty!");
            return;
        }

        System.out.println("=== Spa Queue ===");
        for (Pet pet : spaQueue) {
            System.out.println(pet);
        }
    }
}