import java.util.HashSet;

public class longestSubstring {
    public static void main(String args[]){
        String s = "abcba";
        longestSub(s);
    }

    public static void longestSub(String s){
        HashSet<Character> hashSet = new HashSet<>();
        int firstPointer = 0;
        int secondPointer = 0;
        int maxLength = 0;
        while(secondPointer < s.length()){
            if(!hashSet.contains(s.charAt(secondPointer))){
                hashSet.add(s.charAt(secondPointer));
                secondPointer++;
                maxLength = Math.max(hashSet.size(), maxLength);
            }else{
                hashSet.remove(s.charAt(firstPointer));
                firstPointer++;
            }
        }
        System.out.println("LongestSubstringWithoutRepeatChar: " + maxLength);

    }

}
