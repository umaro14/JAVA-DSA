package DATA_STRUCTURE.HASH.HASHTABLE;

import java.util.Hashtable;
import java.util.Map;

public class HashtableDemo {
    public static void main(String[] args) {
        Map<String, Integer> table = new Hashtable<>();

        table.put("Alice", 25);
        table.put("Bob", 30);
        table.put("Charlie", 35);

        //table.put(null, 40);           // ❌ Throws NullPointerException
        //table.put("Dave", null);       // ❌ Throws NullPointerException

        System.out.println("Hashtable: " + table);

        int age = table.get("Bob");
        System.out.println("Age of Bob: " + age);

        boolean hasAlice = table.containsKey("Alice");
        System.out.println("Has Alice? " + hasAlice);

        table.remove("Charlie");
        System.out.println("Hashtable after removing Charlie: " + table);

        for( Map.Entry<String,Integer> entry: table.entrySet()){
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        };
    }
}
