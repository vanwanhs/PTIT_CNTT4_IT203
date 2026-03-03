
import java.util.LinkedList;
import java.util.Queue;

public class SpaService {

    private Queue<Pet> spaQueue = new LinkedList<>();

    public void addToQueue(Pet pet) {
        spaQueue.offer(pet);
    }

    public Pet serveNext() {
        return spaQueue.poll();
    }

    public void displayQueue() {
        spaQueue.forEach(System.out::println);
    }
}

    