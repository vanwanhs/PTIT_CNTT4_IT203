package session04;

import java.util.*;
import java.util.regex.*;

public class Lesson06 {
    public static void main(String[] args) {
        String review = """
                Cuốn sách này thật ngu ngốc """;
        List<String> blacklist = Arrays.asList(
                "ngu ngốc",
                "tệ hại",
                "dở"
        );
        String regex = "\\b(" + String.join("|", blacklist) + ")\\b";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(review);
        StringBuffer filteredReview = new StringBuffer();
        while (matcher.find()) {
            String word = matcher.group();
            String stars = "*".repeat(word.length());
            matcher.appendReplacement(filteredReview, stars);
        }
        matcher.appendTail(filteredReview);
        String result = filteredReview.toString();
        if (result.length() > 200) {
            int cutIndex = result.lastIndexOf(" ", 200);
            if (cutIndex == -1) {
                cutIndex = 200;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(result.substring(0, cutIndex));
            sb.append("...");
            result = sb.toString();
        }
        System.out.println("Đánh giá sau khi xử lý:");
        System.out.println(result);
    }
}
