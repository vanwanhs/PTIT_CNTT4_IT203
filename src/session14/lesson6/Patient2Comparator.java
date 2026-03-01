package lesson6;

import java.util.Comparator;

public class Patient2Comparator implements Comparator<Patient2> {

    @Override
    public int compare(Patient2 p1, Patient2 p2) {

        if (p1.getSeverity() != p2.getSeverity()) {
            return p1.getSeverity() - p2.getSeverity();
        }
        if (p1.getArrivalTime() != p2.getArrivalTime()) {
            return p1.getArrivalTime() - p2.getArrivalTime();
        }
        return p1.getName().compareTo(p2.getName());
    }
}