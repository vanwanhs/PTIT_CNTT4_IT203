package session07.lesson5;

public class Main {
    public static void main(String[] args) {

        double score = 8.5;

        System.out.println("Điểm nhập vào: " + score);

        if (score >= Config.MIN_SCORE && score <= Config.MAX_SCORE) {
            System.out.println("Điểm hợp lệ");
        } else {
            System.out.println("Điểm không hợp lệ");
        }
    }

}
