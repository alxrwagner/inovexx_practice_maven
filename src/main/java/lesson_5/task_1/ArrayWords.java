package lesson_5.task_1;

import java.util.HashMap;
import java.util.Map;

public class ArrayWords {
    public static void start(String[] array){
        Map<String, Integer> words = new HashMap<>();
        for (String word : array){
            if (words.containsKey(word)){
                words.put(word, words.get(word) + 1);
            }else words.put(word, 1);
        }

        words.forEach((key, value) -> System.out.println(key + " : " + value));
    }
}
