import java.util.Arrays;

public class TwoSum_SortedArray {
    public static void main(String args[]){
        int[] nums = {4, 8, 9, 27, 42};
        int target = 13;
        System.out.println(Arrays.toString(twoSumSolution(nums, target)));
    }

    public static int[] twoSumSolution(int[] nums, int target){
        int[] result = new int[2];
        int leftPointer = 0;
        int rightPointer = nums.length - 1;
        while(leftPointer < rightPointer){
            int sum = nums[leftPointer] + nums[rightPointer];
          if(sum == target){
              result[0] = leftPointer;
              result[1] = rightPointer;
              return result;
          }else if(sum < target){
              leftPointer++;
          }else{
              rightPointer--;
          }
        }
      return nums;
    }
}
