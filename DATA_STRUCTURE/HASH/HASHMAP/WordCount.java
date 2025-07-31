package DATA_STRUCTURE.HASH.HASHMAP;

import java.util.HashMap;
import java.util.Map;

public class WordCount {
    public static void main(String[] args) {
        String text = "This is a test This is only a test";
        Map<String, Integer> wordCount = new HashMap<>();

        for(String word : text.split(" ")){
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        System.out.println(wordCount);
    }
}
