import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class longestCommonPrefix {
    public static void main(String args[]){
        String[] strArray = new String[] {"flower","flow","flight"};
        System.out.println(longestCommPrefix(strArray));
    }

    public  static String longestCommPrefix(String[] strArray){
        String prefix = strArray[0];
        for(int i = 1; i < strArray.length; i++){
            while(strArray[i].indexOf(prefix) != 0){
                prefix=prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;
    }
}
