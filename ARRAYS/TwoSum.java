package ARRAYS;

import java.util.Map;

//TWO SUM ==> ADDING TWO NUMBERS TO GET THE TARGET.
//BRUTE FPRCE O(N^2) Slow for Large Arrays==> ITERRATE OVER ALL ELEMENTS TO CHECK THE TWO VALUES THAT SUM UP TO THE TARGET.
//OPTIMIZED SOLUTION [TIME: O(N), SPACE: O(N)] ==> USE HASHMAP TO STORE THE ELEMENTS AND THEIR INDEX, O(N) BECAUSE WE ITERRATING OVER THE VALUES ONLY ONCE.


import java.util.HashMap;
import java.util.Arrays;

class Solutionn {
    
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i];

            if(map.containsKey(complement)){
                return new int[] { map.get(complement), i };
            }
            // Add the current number and its index to the map
            map.put(nums[i], i);
        }


        return null;
    }
}

public class TwoSum {
    public static void main(String[] args) {
        int target = 9;
        int[] nums = {2, 7, 11, 15, 47, 49, 101};

        int[] result = Solutionn.twoSum(nums, target);

        if(result != null) {
            System.out.println("Indexes: " + Arrays.toString(result));
            System.out.println("Values: " + nums[result[0]] + " + " + nums[result[1]] + " = " + target);
        } else {
            System.out.println("No solution found.");
        }
    }
}
