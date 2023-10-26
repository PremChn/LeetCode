import java.util.Arrays;

public class MoveZeros {
/*
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
Note that you must do this in-place without making a copy of the array.
Example 1:
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]

Example 2:
Input: nums = [0]
Output: [0]
 */
    public static void main(String args[]){
        int[] nums = new int[] {0,1,0,3,12};

        System.out.println(Arrays.toString(moveZeros(nums)));
    }
    //The concept is to move all the non-zero numbers to left by iterating the entire array
    //Then fill the moved spot with zeros.
    public static int[] moveZeros(int[] nums){
        int insertPosition = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[insertPosition]  = nums[i];
                insertPosition++;
            }
        }

        while (insertPosition < nums.length){
            nums[insertPosition] = 0;
            insertPosition++;
        }
        return nums;
    }
}
