public class sumOf_K_ElementsInArray {
    public static void main(String args[]){
        //int[] nums = {1,9,-1,-2,7,3,-1,2};
        int[] nums = {1,2,3,4,5};
        int k = 3;
        System.out.println(sumOfKElements(nums,k));
    }

    public static int sumOfKElements(int[] nums, int k){
        int windowSum = 0;
        int maxSum = 0;
        int startPointer = 0;
        int endPointer = 0;

        while(endPointer < k){
            windowSum += nums[endPointer];
            endPointer++;
        }

         while(endPointer < nums.length){
            System.out.println(nums[endPointer]);
            windowSum = windowSum + nums[endPointer++] - nums[startPointer++];
            //endPointer++;
            //startPointer++;
            maxSum = Math.max(windowSum, maxSum);
        }
        return maxSum;
    }
}
