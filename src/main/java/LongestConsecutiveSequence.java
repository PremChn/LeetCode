import java.util.HashMap;

/*
Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
You must write an algorithm that runs in O(n) time.
Example 1:
Input: nums = [100,4,200,1,3,2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.

Example 2:
Input: nums = [0,3,7,2,5,8,4,6,0,1]
Output: 9
Constraints:
0 <= nums.length <= 105
-109 <= nums[i] <= 109
Youtube Reference: https://www.youtube.com/watch?v=LvbtUMdcgbw
 */
public class LongestConsecutiveSequence {
    public static void main(String args[]) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        System.out.println(longestConsecutive(nums));

    }

    public static int longestConsecutive(int[] nums) {
        HashMap<Integer, Boolean> exploredMap = new HashMap<>();
        int longestLength = 0;
        for (int num : nums) {
            exploredMap.put(num, Boolean.FALSE);
        }
        for (int num : nums) {
            int currentLength = 1;
            //check in forward direction
            int nextNum = num + 1;
            while (exploredMap.containsKey(nextNum) && exploredMap.get(nextNum) == false) {
                currentLength++;
                exploredMap.put(nextNum, Boolean.TRUE);
                //move to the next number;
                nextNum++;
            }
            //check in backward direction
            int previousNum = num - 1;
            while (exploredMap.containsKey(previousNum) && exploredMap.get(previousNum) == false) {
                currentLength++;
                exploredMap.put(previousNum, Boolean.TRUE);
                //move to next number
                previousNum--;
            }
            longestLength = Math.max(longestLength, currentLength);
        }
        return longestLength;
    }
}
