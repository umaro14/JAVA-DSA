//space Complexity – O(1) (constant)
//Time Complexity – O(n) (linear) where n is the number of elements in the array
//✅ Step 1: Check Length
//If the lengths of s and t are not equal → return false.
//
//✅ Step 2: Count characters
//Loop through string s and increment count for each character.
//
//Loop through string t and decrement count for each character.
//
//At the end, if all counts are 0, it's a valid anagram.

//EASIER WAY WITH HASMAP

package ARRAYS;

import java.util.HashMap;

/*class Anagram {

    public boolean isAnagram(String s, String t) {
       if(s.length() != t.length()){
         return false;
       }

       HashMap<Character, Integer> countMap = new HashMap<>();

        //step 1: Count characters in string s
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (countMap.containsKey(c)) {
                countMap.put(c, countMap.get(c) + 1);  // If character exists, increment it
            } else {
                countMap.put(c, 1);  // If character doesn't exist, initialize it with 1
            }
        }


        //step 2: Subtract characters in string t
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (!countMap.containsKey(c)) {
                return false;             // If 't' has a character that is not in 's' then is not an anagram     
            }
            countMap.put(c, countMap.get(c) - 1);   //C = key,countMap.get(c) - 1 = Value ...Subtract 1 from that count (because we found one occurrence of c in string t). Decrease count for 't' characters, this will be zero if they are an anagram
            if (countMap.get(c) < 0) {              //// If count goes negative, they are not anagrams
                return false;
            }
        }

        // Step 3: If all counts are zero, they are anagrams
        return true;
    }
}*/

//MORE OPTIMIZED WAY
class Anagram {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character, Integer> newAnagram1= new HashMap<>();
        HashMap<Character, Integer> newAnagram2= new HashMap<>();

        for(int i = 0; i < s.length();i++){
            
            newAnagram1.put(s.charAt(i),newAnagram1.getOrDefault(s.charAt(i),0) +1);
            newAnagram2.put(t.charAt(i),newAnagram2.getOrDefault(t.charAt(i),0) +1);
        } 
        return newAnagram1.equals(newAnagram2);
    }
}

public class ValidAnagram{

    public static void main(String[] args) {
      Anagram solution =  new Anagram();
        System.out.println(solution.isAnagram("listend", "silentd")); 
    }
}