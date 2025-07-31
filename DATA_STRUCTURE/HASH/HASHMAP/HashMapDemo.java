package DATA_STRUCTURE.HASH.HASHMAP;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("Baby", 23);
        map.put("Dad", 65);
        map.put("Mom", 55);
        map.put("Friend", 28);

        int age = map.get("Baby");
        System.out.println(age); 

        boolean hashDad = map.containsKey("Dad");
        System.out.println("Contains Dad: " + hashDad);

        map.remove("friend");
        System.out.println("After removal: " + map);

        System.out.println(map.values());
        System.out.println(map.keySet());
        System.out.println(map.entrySet());
      

        for(Map.Entry<String, Integer> entry: map.entrySet()){
             System.out.println(entry.getKey() + " -> " + entry.getValue());
        };
    }
}
