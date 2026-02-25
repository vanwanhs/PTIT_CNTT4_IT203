package session07.lesson3;

public class Main {
    public static void main(String[] args) {
            double[] scores = {6.5, 8.0, 4.5};
            System.out.println("Danh sách điểm: 6.5, 8.0, 4.5");
            System.out.println("\n>> Kết quả xử lý:");
            double average = ScoreUtils.calculateAverage(scores);
            System.out.printf("- Điểm trung bình cả lớp: %.2f\n", average);
            for (double score : scores) {
                boolean pass = ScoreUtils.checkPass(score);
                System.out.println("- Điểm " + score + ": " + (pass ? "Đạt" : "Trượt"));
            }
    }
}
