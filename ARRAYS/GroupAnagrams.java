package ARRAYS;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs){              //return type is List<List<String>> which is a 2D list
        HashMap<String, List<String>> map = new HashMap<>();             // HashMap with String as key and List as value

        for (String word : strs) {
            char[] myCharArray = word.toCharArray();                 // Turns each word into a char array
            Arrays.sort(myCharArray);
            String sorted = new String(myCharArray);                //Converts the sorted char array back into a string.

            if(!map.containsKey(sorted)){
                map.put(sorted, new ArrayList<>());
            } else{
                map.get(sorted).add(word);
            }
        }
        return new ArrayList<>(map.values());
    }
}



public class GroupAnagrams {
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat"};
        Solution solution = new Solution();
        List<List<String>> result = solution.groupAnagrams(strs);
        System.out.println(result);
       
    }
}

