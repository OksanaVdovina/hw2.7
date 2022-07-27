import java.util.*;

public class Main {
    private static final List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }
    public static void task1() {
        List<Integer> numbers = new ArrayList<>(List.of());
        for (Integer num : nums) {
            if (num % 2 != 0) {
                numbers.add(num);
            }
        }
        System.out.println(numbers);

    }

    public static void task2() {
        HashSet<Integer> set = new HashSet<>();
        for (Integer num : nums) {
            if (num % 2 == 0) {
                set.add(num);
            }
        }
        System.out.println(set);

    }

    public static void task3() {
        List<String> words = new ArrayList<>(List.of("Катя", "Таня", "Таня", "Кристина"));
        HashSet<String> set2 = new HashSet<>();
        for (int i = 0; i < words.size(); i++) {
            set2.add(words.get(i));
        }
        System.out.println(set2);
    }

    public static void task4() {
        List<String> words = new ArrayList<>(List.of("Катя", "Таня", "Таня", "Кристина", "Марина", "Марина", "Алина"));
        Map<String, Integer> countDup = new HashMap<>();
        for (String word : words) {
            if (!countDup.containsKey(word)) {
                countDup.put(word, 0);
            }
            countDup.put(word, countDup.get(word) + 1);
        }
        for (Map.Entry<String, Integer> word : countDup.entrySet()) {
            if (word.getValue() != 1) {
                System.out.println(word.getKey() + " " + word.getValue());
            }
        }

    }
}

