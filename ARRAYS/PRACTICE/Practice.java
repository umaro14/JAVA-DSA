package ARRAYS.PRACTICE;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

class Solution {
   public int[] TopKFrequent(int[] nums, int k){

        //frequency map
        HashMap<Integer,Integer> countMap = new HashMap<>();

        for(int num : nums){
            if(countMap.containsKey(num)){
                countMap.put(num, countMap.get(num) + 1);
            } 
            countMap.put(num, 1);
        }

        //MinHeap based on Frequency
        PriorityQueue<Map.Entry<Integer, Integer>> heap = new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());

        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()){             //
            heap.offer(entry);
            if(heap.size() > k) heap.poll();
        }

        //Extract tok elements
        int[] result = new int[k];
        int i = 0;
        while(!heap.isEmpty()){
            result[i++] = heap.poll().getKey();
        }
        return result;
    }
}



public class Practice {
    public static void main(String[] args) {
        int[] nums = {1,2,4,5,5,5,7,7,7};
        int k = 2;
        Solution solution = new Solution();
        int[] result = solution.TopKFrequent(nums, k);
        System.out.println("Top K Frequent Elements: " + java.util.Arrays.toString(result));
    }
}
