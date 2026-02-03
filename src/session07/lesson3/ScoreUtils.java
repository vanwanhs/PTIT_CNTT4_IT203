package session07.lesson3;

import java.util.Scanner;

public class ScoreUtils {
    public static boolean checkPass(double score) {
        return score >= 5.0;
    }
    public static double calculateAverage(double[] scores) {
        if (scores == null || scores.length == 0) {
            return 0;
        }

        double sum = 0;
        for (double score : scores) {
            sum += score;
        }

        return sum / scores.length;
    }
}
