package lesson5;
import java.util.Stack;

public class EmergencyCase {

    private Patient patient;
    private Stack<TreatmentStep> steps;

    // Constructor
    public EmergencyCase(Patient patient) {
        this.patient = patient;
        this.steps = new Stack<>();
    }

    // Thêm bước xử lý (push)
    public void addStep(TreatmentStep step) {
        steps.push(step);
    }

    // Undo bước xử lý gần nhất (pop)
    public TreatmentStep undoStep() {
        if (steps.isEmpty()) {
            System.out.println("Không có bước nào để undo!");
            return null;
        }
        return steps.pop();
    }

    // Hiển thị các bước xử lý
    public void displaySteps() {
        if (steps.isEmpty()) {
            System.out.println("Chưa có bước xử lý nào!");
            return;
        }

        System.out.println("Các bước xử lý của " + patient + ":");
        for (TreatmentStep step : steps) {
            System.out.println(step);
        }
    }

    public Patient getPatient() {
        return patient;
    }
}