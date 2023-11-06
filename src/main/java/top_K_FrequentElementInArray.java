import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* Leet Code Problem No.: 1387
Given an integer array nums and an integer k, return the k most frequent elements. You may return
the answer in any order.
Example 1:
Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2]
Example 2:
Input: nums = [1], k = 1
Output: [1]
Video reference: https://www.youtube.com/watch?v=EBNPu0GgM64
 */
public class top_K_FrequentElementInArray {
    public static void main(String args[]) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;
        System.out.println(Arrays.toString(topKFrequent(nums, k)));
    }
    public static int[] topKFrequent(int[] nums, int k) {
        List<Integer>[] bucket = new List[nums.length - 1];
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        int value = 0;
        for (int i : nums) {
            if (frequencyMap.containsKey(i)) {
                frequencyMap.put(i, frequencyMap.get(i) + 1);
            } else {
                frequencyMap.put(i, 1);
            }
        }
        //you can rewrite the above for loop in this way
        /*for(int i : nums){
            frequencyMap.put(i, frequencyMap.getOrDefault(i, 0) + 1);
        }*/
        for (int key : frequencyMap.keySet()) {
            int frequency = frequencyMap.get(key);
            if (bucket[frequency] == null) {
                bucket[frequency] = new ArrayList<>();
            }
            bucket[frequency].add(key);
        }
        int[] res = new int[k];
        int counter = 0;
        for (int pos = bucket.length - 1; pos >= 0 & counter < k; pos--) {
            if (bucket[pos] != null) {
                for (Integer integer : bucket[pos]) {
                    res[counter++] = integer;
                }
            }
        }
        return res;
    }
}
