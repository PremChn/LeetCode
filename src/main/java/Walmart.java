import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Walmart {
    /* Your task is to write a function that, given a list of words and a string, finds and returns the word in the list that is scrambled inside the string, if any exists. If none exist,
    it returns the result "-" as a string. There will be at most one matching word. The letters don't need to be in order or next to each other. The letters cannot be reused.

    Example:
    words = ["baby", "referee", "cat", "dada", "dog", "bird", "ax"]
    string1 = "ctay"
    find(words, string1) => "cat" (the letters do not have to be in order)

    string2 = "bcanihjsrrrferet"
    find(words, string2) => "cat" (the letters do not have to be together)

    string3 = "tbaykkjlga"
    find(words, string3) => "-" (the letters cannot be reused)

    string4 = "bbbblkkjbaby"
    find(words, string4) => "baby"

    string5 = "dad"
    find(words, string5) => "-" */

    public static String find(List<String> words, String str) {
        for (String word : words) {
            if (isScrambled(word, str)) {
                return word;
            }
        }
        return "-";
    }

    private static boolean isScrambled(String word, String str) {
        /*if (word.length() != str.length()) {
            return false;
        }*/

        int[] counts = new int[26]; // Assuming only lowercase letters

        for (char c : str.toCharArray()) {
            counts[c - 'a']++;
        }

        for (char c : word.toCharArray()) {
            if (counts[c - 'a'] == 0) {
                return false;
            }
            counts[c - 'a']--;
        }

        return true;
    }

    public static void main(String[] args) {
        List<String> words = new ArrayList<>(Arrays.asList("baby", "cat", "referee",  "dada", "dog", "bird", "ax"));
        String string1 = "bcnihjsrrrferet";
        String result = find(words, string1);
        System.out.println(result);
    }
}
