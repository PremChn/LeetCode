import java.util.Arrays;

/*
Leet Code Problem No.: 238 - https://leetcode.com/problems/product-of-array-except-self/
Given an integer array nums, return an array answer such that answer[i] is equal to the product
of all the elements of nums except nums[i].
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
You must write an algorithm that runs in O(n) time and without using the division operation.
Example 1:
Input: nums = [1,2,3,4]
Output: [24,12,8,6]

Example 2:
Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]

Constraints:
2 <= nums.length <= 105
-30 <= nums[i] <= 30
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
Follow up: Can you solve the problem in O(1) extra space complexity?
(The output array does not count as extra space for space complexity analysis.)
Youtube reference - https://www.youtube.com/watch?v=G9zKmhybKBM
 */
public class ProductofArrayExceptSelf {
    public static void main(String args[]){
        int[] nums = {1, 2, 3, 4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));

    }

    public static int[] productExceptSelf(int[] nums) {
        int[] leftPointer = new int[nums.length];
        int[] rightPointer = new int[nums.length];
        leftPointer[0] = 1;
        for(int i = 1; i < nums.length; i++){
            leftPointer[i] = leftPointer[i - 1] * nums[i - 1];
        }
        rightPointer[nums.length - 1] = 1;
        System.out.println(nums.length - 2);
        for(int j = nums.length - 2; j > -1; j--){
            System.out.println(rightPointer[j + 1] );
            System.out.println(nums[j + 1] );
            rightPointer[j] = rightPointer[j + 1] * nums[j + 1];
            System.out.println(Arrays.toString(rightPointer));
        }

        int[] ans = new int[nums.length];
        for(int k = 0; k < nums.length; k++){
            ans[k] = leftPointer[k] * rightPointer[k];
        }
        return ans;
    }
}
