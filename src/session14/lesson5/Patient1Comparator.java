package lesson5;

import java.util.Comparator;

public class Patient1Comparator implements Comparator<Patient5> {

    @Override
    public int compare(Patient5 p1, Patient5 p2) {

        if (p1.getSeverity() != p2.getSeverity()) {
            return p1.getSeverity() - p2.getSeverity();
        }
        if (p1.getArrivalTime() != p2.getArrivalTime()) {
            return p1.getArrivalTime() - p2.getArrivalTime();
        }
        return p1.getName().compareTo(p2.getName());
    }
}