package lesson5;
public class TreatmentStep {
    private String description;
    private String time;

    // Constructor
    public TreatmentStep(String description, String time) {
        this.description = description;
        this.time = time;
    }

    // Getter & Setter
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Step{" + description + " - " + time + "}";
    }
}