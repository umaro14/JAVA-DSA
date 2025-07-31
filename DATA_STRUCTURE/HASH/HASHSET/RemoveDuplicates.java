package DATA_STRUCTURE.HASH.HASHSET;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {
     public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(1, 2, 2, 3, 3, 3));
        Set<Integer> uniqueNumbers = new HashSet<>(numbers);

        System.out.println("Unique numbers: " + uniqueNumbers); // [1, 2, 3]
    }
}
