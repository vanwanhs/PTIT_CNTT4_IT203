package lesson3;

import java.util.HashSet;
import java.util.Set;

public class DrugSaftyCheck {
    public static void main(String[] args) {
        Set<String> list = new HashSet<>();
        list.add("Aspirin");
        list.add("Caffeine");
        list.add("Paracetamol");
        Set<String> list1 = new HashSet<>();
        list1.add("Penicillin");
        list1.add("Aspirin");
        Set<String> warning = new HashSet<>(list);
        warning.retainAll(list1);
        Set<String> saftyWarning = new HashSet<>(list);
        saftyWarning.removeAll(list1);
        System.out.println("Cảnh báo " + warning);
        System.out.println("Thành phần an toàn " + saftyWarning);
    }
}
