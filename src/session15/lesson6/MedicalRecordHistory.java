package lesson6;
import java.util.Stack;

public class MedicalRecordHistory {

    private Stack<EditAction> editStack = new Stack<>();
    private String recordId;

    public MedicalRecordHistory(String recordId) {
        this.recordId = recordId;
    }

    public void addEdit(EditAction action) {
        editStack.push(action);
    }

    public EditAction undoEdit() {
        if (editStack.isEmpty()) return null;
        return editStack.pop();
    }

    public void displayHistory() {
        for (EditAction a : editStack) {
            System.out.println(a);
        }
    }
}