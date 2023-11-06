import java.util.HashSet;

public class ContainsDuplicate {
    /*Given an integer array nums, return true if any value appears at least twice in the array,
    and return false if every element is distinct.
    Example 1:
    Input: nums = [1,2,3,1]
    Output: true

    Example 2:
    Input: nums = [1,2,3,4]
    Output: false
    */
    public static void main(String args[]){
        int[] arr = new int[] {1,4,3,0};
        System.out.println("Contains duplicate: " + containsDuplication(arr));
    }

    public static boolean containsDuplication(int[] arr){
        //We are using HashSet because it doesn't take duplicate
        HashSet<Integer> hashSet = new HashSet<>();
        boolean status = false;
        for(int i = 0; i < arr.length; i++){
            if(hashSet.contains(arr[i])){
                status = true;
                break;
            }else{
                hashSet.add(arr[i]);
            }

        }
        return status;

        /*Same solution using better way*%
        Set<Integer> uniqueElements = new HashSet<>();
        for (int element : arr) {
            if (!uniqueElements.add(element)) {
                return true; // Duplicate found, no need to continue
            }
        }
        return false; // No duplicates found*/
        }
}