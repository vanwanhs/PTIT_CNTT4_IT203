package session04;

import java.util.*;
import java.util.regex.*;

public class Lesson06 {
    public static void main(String[] args) {
        String review = """
                Cuốn sách này thật sự rất hay, nhưng có một số đoạn nội dung khá ngu ngốc 
                và tệ hại. Tôi không thích cách tác giả viết ở phần cuối vì quá dở và thiếu logic.
                Tuy nhiên nhìn chung vẫn đáng đọc cho sinh viên.
                """;
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
