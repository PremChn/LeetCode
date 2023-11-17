import java.util.Stack;
/*
Leet Code Problem No. 844 - https://leetcode.com/problems/backspace-string-compare/description/
Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.
Note that after backspacing an empty text, the text will continue empty.
Example 1:
Input: s = "ab#c", t = "ad#c"
Output: true
Explanation: Both s and t become "ac".

Example 2:
Input: s = "ab##", t = "c#d#"
Output: true
Explanation: Both s and t become "".

Example 3:
Input: s = "a#c", t = "b"
Output: false
Explanation: s becomes "c" while t becomes "b".

Constraints:
1 <= s.length, t.length <= 200
s and t only contain lowercase letters and '#' characters.
Follow up: Can you solve it in O(n) time and O(1) space?
 */

public class BackspaceStringCompare {
    public static void main(String[] args) {
        String s = "a##c";
        String t = "#a#c";
        System.out.println(backspaceCompare(s, t));
    }

    public static boolean backspaceCompare(String s, String t) {
        Stack<Character> Stack1 = new Stack<>();
        Stack<Character> Stack2 = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != '#'){
                Stack1.push(s.charAt(i));
            }else if(!Stack1.empty()){
                Stack1.pop();
            }
        }
        for(int i = 0; i < t.length(); i++){
            if(t.charAt(i) != '#'){
                Stack2.push(t.charAt(i));
            }else if(!Stack2.empty()){
                Stack2.pop();
            }
        }
        if (Stack1.size() != Stack2.size()) {
            return false;
        }

        // Check each element
        for (int i = 0; i < Stack1.size(); i++) {
            if (!Stack1.get(i).equals(Stack2.get(i))) {
                return false;
            }
        }
        return true;

    }
}