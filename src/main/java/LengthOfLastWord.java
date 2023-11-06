import static java.util.Collections.replaceAll;

public class LengthOfLastWord {
    /*Given a string s consisting of words and spaces, return the length of the last word in
    the string.
    A word is a maximal substring consisting of non-space characters only.
    Example 1:
    Input: s = "Hello World"
    Output: 5
    Explanation: The last word is "World" with length 5.

    Example 2:
    Input: s = "   fly me   to   the moon  "
    Output: 4
    Explanation: The last word is "moon" with length 4.

    Example 3:
    Input: s = "luffy is still joyboy"
    Output: 6
    Explanation: The last word is "joyboy" with length 6.*/

    public static void main(String args[]){
        String s = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(s));
    }

    public static int lengthOfLastWord(String s){
       if(s.length() <= 1) return 1;

        //To replaced double space with single space
        s = s.replaceAll("\\s{2,}", " ");
        String[] strArray = s.split(" ");

        if(strArray.length == 1){
            return strArray[0].length();
        }else{
            return strArray[strArray.length - 1].length();
        }

    }
}
