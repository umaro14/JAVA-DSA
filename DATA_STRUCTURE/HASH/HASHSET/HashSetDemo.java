package DATA_STRUCTURE.HASH.HASHSET;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();

        names.add("Alice");
        names.add("Bob");
        names.add("Alice");
        names.add("Charlie");

        System.out.println("hashSet: " + names);

        boolean hashBob = names.contains("Bob");
        System.out.println("Contains BoB? " + hashBob);

        names.forEach(name -> System.out.println( " Hello " + name));

        names.remove("Charlie");
        

        for(String name : names){
            System.out.println(name);
        }

        System.out.println("Size: " + names.size()); // 2
        System.out.println("Is empty? " + names.isEmpty());

    }
}
