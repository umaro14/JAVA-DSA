package ARRAYS;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;


class Solution{
    public int[] TopKFrequent(int[] nums, int k){

        //frequency map
        HashMap<Integer,Integer> countMap = new HashMap<>();
        for(int num : nums){
            //count.put(num, count.getOrDefault(num, 0) + 1);
             if(countMap.containsKey(num)){
                countMap.put(num, countMap.get(num) + 1);
            } 
            countMap.put(num, 1);
        }

        //MinHeap based on Frequency
        PriorityQueue<Map.Entry<Integer, Integer>> heap = new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());

        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()){       //This gives you all key-value pairs from the countMap, without the "Map.Entry" it will give all pairs
            heap.offer(entry);                                               //add elenebt in to Queue
            if(heap.size() > k) heap.poll();    //If the heap now has more than k elements, we remove the smallest one (least frequent).
        }

        //Extract top k elements
        int[] result = new int[k];
        int i = 0;
        while(!heap.isEmpty()){                      //this loop will only run twice
            result[i++] = heap.poll().getKey();      // this adds the 2 top elements to the result array
        }
        return result;
    }
}

public class TopKFrequentElement {
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        int k = 2;
        Solution solution = new Solution();
        int[] result = solution.TopKFrequent(nums, k);
        System.out.println("Top K Frequent Elements: " + java.util.Arrays.toString(result));
    }
}
