package lesson6;
import java.util.LinkedList;
import java.util.Queue;

public class PatientWaitingQueue {

    private Queue<Patient6> waitingQueue = new LinkedList<>();
    private int totalPatients = 0;

    public void addPatient(Patient6 p) {
        waitingQueue.add(p);
        totalPatients++;
    }

    public Patient6 callNextPatient() {
        if (waitingQueue.isEmpty()) return null;
        totalPatients--;
        return waitingQueue.poll();
    }

    public void displayQueue() {
        for (Patient6 p : waitingQueue) {
            System.out.println(p);
        }
    }
}