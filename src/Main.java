import com.sun.source.tree.IfTree;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Задание 1
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<String> word = new ArrayList<>(List.of("первый", "второй", "первый", "третий", "четвёртый", "пятый", "третий", "второй", "седьмой"));
        Set<Integer> numbers = new HashSet<>();
        Set<String> words = new HashSet<>();
        Set<String> words2 = new HashSet<>();

        System.out.println("Задание 1");
        for (int i = 0; i < nums.size(); i++) {
            if (!(i % 2 == 0)) {
                System.out.println(nums.get(i));
            }
        }
        System.out.println("Задание 2");
        Collections.sort(nums);
        for (int i = 0; i < nums.size(); i++) {
            if (i % 2 == 0) {
                numbers.add(nums.get(i));
            }
        }
        System.out.println(numbers);

        System.out.println("Задание 3");
        for (int i = 0; i < word.size(); i++) {
            if (i % 2 == 0) {
                words.add(word.get(i));
            }
        }
        System.out.println(words);

        System.out.println("Задание 4");
        for (int i = 0; i < word.size(); i++) {
            if ((Collections.frequency(word,word.get(i)) > 1)&!(words2.contains(word.get(i)))) {
                words2.add(word.get(i));
                System.out.println(word.get(i) + " встречается в коллекции " + Collections.frequency(word, word.get(i)) + " раз");
            }
        }
        System.out.println("Все задания выполнены");
    }
}