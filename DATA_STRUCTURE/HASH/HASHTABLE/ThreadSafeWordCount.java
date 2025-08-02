package DATA_STRUCTURE.HASH.HASHTABLE;

import java.util.Hashtable;

public class ThreadSafeWordCount {
    public static void main(String[] args) {
        String text = "This is a sample text for word count. This text is used to demonstrat";
        Hashtable<String, Integer> freqTable = new Hashtable<>();

        for (String word : text.split(" ")) {
            freqTable.put(word, freqTable.getOrDefault(word, 0) + 1);
        }

        System.out.println(freqTable);
    }
}
