import java.util.HashSet;
/*
Leet Code Problem Number: 268 - https://leetcode.com/problems/missing-number/
Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

Example 1:
Input: nums = [3,0,1]
Output: 2
Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.

Example 2:
Input: nums = [0,1]
Output: 2
Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in nums.

Example 3:
Input: nums = [9,6,4,2,3,5,7,0,1]
Output: 8
Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 8 is the missing number in the range since it does not appear in nums.

Constraints:
n == nums.length
1 <= n <= 104
0 <= nums[i] <= n
All the numbers of nums are unique. Follow up: Could you implement a solution using only O(1) extra space complexity and O(n) runtime complexity?
Youtube reference: https://www.youtube.com/watch?v=iCrQG_kbuP0
 */
public class missingNumber {
    public static void main(String args[]){
        //int[] nums = {3,0,1};
        int[] nums = {9,6,4,2,3,5,7,0,1};
        //System.out.println(missingNumber(nums));
        System.out.println(missingNumberUsingXOR(nums));
    }

    //Method 1 - By summing up all the elements of array and subtract each element in array
    public static int missingNumber(int[] nums){
        int arrLength = nums.length;
        int arrTotal = (arrLength * (arrLength + 1) / 2);
        int missingNumber = arrTotal - nums[0];
        for(int i = 1; i < arrLength; i++){
            missingNumber = missingNumber - nums[i];
        }
        return missingNumber;
    }
    //Method 2 - Using XOR operator
    public static int missingNumberUsingXOR(int[] nums) {
        int allXOR = 0;
        // XOR all numbers in range [0, n]
        for (int i = 0; i <= nums.length; i++) {
            allXOR = allXOR ^ i;
        }
        // XOR all numbers in the given array
        for (int num : nums) {
            allXOR = allXOR ^ num;
        }
        // The missing number
        return allXOR;
    }
}
