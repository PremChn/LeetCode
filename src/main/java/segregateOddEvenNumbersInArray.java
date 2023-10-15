import java.util.Arrays;

public class segregateOddEvenNumbersInArray {
    public static void main(String args[]){
        int[] nums = new int[] {1,2,4,3,5,7,8,6};
        System.out.println(Arrays.toString(segregate(nums)));
    }

    public static int[] segregate(int[] nums){
        if(nums.length <= 1){
            return nums;
        }

        int left = 0;
        int right = nums.length - 1;

        while(left < right){
            while(nums[left] % 2 == 0 && left < right){
                left ++;
            }
            while(nums[right] % 2 != 0 && left < right){
                right --;
            }

            if(left < right){
                int x = nums[left];
                nums[left] = nums[right];
                nums[right] = x;

                left ++;
                right --;
            }
        }
        return nums;
    }
}
