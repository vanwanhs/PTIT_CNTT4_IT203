package lesson1;
public class EditAction {
    private String description; // mô tả chỉnh sửa
    private String time;        // thời điểm chỉnh sửa

    // Constructor
    public EditAction(String description, String time) {
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
        return "EditAction{" +
                "description='" + description + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}