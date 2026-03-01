package lesson6;

public class Patient2 {
    private String name;
    private int severity;
    private int arrivalTime;

    public Patient2(String name, int severity, int arrivalTime) {
        this.name = name;
        this.severity = severity;
        this.arrivalTime = arrivalTime;
    }

    public String getName() {
        return name;
    }

    public int getSeverity() {
        return severity;
    }

    public int getArrivalTime() {
        return arrivalTime;
    }

    @Override
    public String toString() {
        String level;
        if (severity == 1) {
            level = "Nguy kịch";
        } else if (severity == 2) {
            level = "Nặng";
        } else {
            level = "Nhẹ";
        }

        return "Bệnh nhân " + name +
                " (Mức " + severity + " - " + level +
                ", đến lúc " + arrivalTime + ")";
    }
}