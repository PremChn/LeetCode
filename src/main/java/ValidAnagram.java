public class ValidAnagram {
    /*Given two strings s and t, return true if t is an anagram of s, and false otherwise.
    An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
    Example 1:
    Input: s = "anagram", t = "nagaram"
    Output: true

    Example 2:
    Input: s = "rat", t = "car"
    Output: false

    Reference video link: https://www.youtube.com/watch?v=IRN1VcA8CGc&ab_channel=NickWhite
    */

    public static void main(String args[]){
        String s1 = "anagram";
        String s2 = "nagaram";

        System.out.println("Is Anagram: " + isAnagram(s1, s2));
    }

    public static boolean isAnagram(String s1, String s2){
        if(s1.length() != s2.length()) return false;
        int[] chars_counts = new int[26];
        for(int i = 0; i < s1.length(); i++){
            chars_counts[s1.charAt(i) - 'a']++;
            chars_counts[s2.charAt(i) - 'a']--;
        }

        for(int count : chars_counts){
            if(count != 0){
                return false;
            }
        }
        return true;


    }


}
