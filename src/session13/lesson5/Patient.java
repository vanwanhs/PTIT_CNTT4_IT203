package lesson5;

public class Patient {
    String name;
    int severity;      // 1: Nguy kịch, 2: Nặng, 3: Nhẹ
    int arrivalTime;   // phút

    public Patient(String name, int severity, int arrivalTime) {
        this.name = name;
        this.severity = severity;
        this.arrivalTime = arrivalTime;
    }
}