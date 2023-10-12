import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Walmart {
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
