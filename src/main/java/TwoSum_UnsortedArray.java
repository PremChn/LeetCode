import java.util.Arrays;
import java.util.HashMap;
public class TwoSum_UnsortedArray {
    /*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
    You may assume that each input would have exactly one solution, and you may not use the same element twice.
    You can return the answer in any order.
    Example 1:
    Input: nums = [2,7,11,15], target = 9
    Output: [0,1]
    Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].*/

    public static void main(String args[]){
        int[] nums = new int[] {1,2,15,7,11};
        int target = 9;
        System.out.println(Arrays.toString(twoSums(nums, 9)));
    }

    public static int[] twoSums(int[] nums, int target){
        int[] arr = new int[2];
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(hashMap.containsKey(target - nums[i])){
                arr[0] = hashMap.get(target - nums[i]);
                arr[1] = i;
            }
            hashMap.put(nums[i],i);
        }
        return arr;
    }
}
