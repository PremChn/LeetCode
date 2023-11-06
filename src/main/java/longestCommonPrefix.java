import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class longestCommonPrefix {
    public static void main(String args[]){
        String[] strArray = new String[] {"flower","flow","flight"};
        //System.out.println(longestCommPrefix(strArray));
        System.out.println(longestCommPrefixSorting(strArray));
    }

    public static String longestCommPrefix(String[] strArray){
        String prefix = strArray[0];
        for(int i = 1; i < strArray.length; i++){
            System.out.println(strArray[i].indexOf(prefix));
            while(strArray[i].indexOf(prefix) != 0){
                prefix=prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;
    }

    public static String longestCommPrefixSorting(String[] strArray){
        Arrays.sort(strArray);
        char[] firstChar = strArray[0].toCharArray();
        char[] lastChar = strArray[strArray.length - 1].toCharArray();
        StringBuffer result = new StringBuffer();

        for(int i = 0; i < firstChar.length; i++){
            if(firstChar[i] != lastChar[i]) break;
            result.append(firstChar[i]);
        }
        return result.toString();
    }
}
