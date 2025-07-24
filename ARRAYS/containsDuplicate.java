//Given an integer array nums, return true if any value appears at least twice
//in the array and return false if every element is distrinct

//BRUTE FORCE ==> COMPARE ONE VALUE AGAINST ALL, time: O(n^2), space: o(1). nested loops
//FASTER --> SORTING O(nlogn)
//MUCH FASTEST --> HASHSET O(n) IERRATING OVER THE HASH ONCE

package ARRAYS;

import java.util.HashSet;

class Solution{
    public boolean containsDuplicate(int[] nums) {
      HashSet<Integer> seenNumbers = new HashSet<>();

      for( int num : nums ){
        if(seenNumbers.contains(num)){
            return true;
        }
        seenNumbers.add(num);
      }
      return false;
    }
    
   }

public class containsDuplicate {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1,2,3,4,5,6,7};
        System.out.println(solution.containsDuplicate(nums));
}
};