import java.util.*;

/*
Leet Code Problem Number: 49
Given an array of strings strs, group the anagrams together. You can return the answer in any order.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
typically using all the original letters exactly once.
Example 1:
Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

Example 2:
Input: strs = [""]
Output: [[""]]

Example 3:
Input: strs = ["a"]
Output: [["a"]]

Constraints:
1 <= strs.length <= 104
0 <= strs[i].length <= 100
strs[i] consists of lowercase English letters.
 */
public class groupAnagram {
    public static void main(String args[]){
       String[] strs = {"eat","tea","tan","ate","nat","bat"};

       System.out.println(groupAnagrams(strs));
        //more efficient way
       System.out.println(groupAnagramsUsingSort(strs));
    }
   public static List<List<String>> groupAnagramsUsingSort(String[] strs){
       if(strs == null || strs.length == 0) return new ArrayList<>();
       Map<String, List<String>> hashMap = new HashMap<>();
       for(String s : strs){
           char[] charArray = s.toCharArray();
           Arrays.sort(charArray);
           String sortedString = new String(charArray);
           if(hashMap.containsKey(sortedString)){
               hashMap.get(sortedString).add(s);
           }else{
               List<String> stringList = new ArrayList<>();
               stringList.add(s);
               hashMap.put(sortedString, stringList);
           }
       }
       return new ArrayList<>(hashMap.values());

   }
   public static List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0) return new ArrayList<>();
        Map<String, List<String>> frequenceyStringMap = new HashMap<>();
        for(String s : strs){
            String frequencyString = getFrequencyString(s);
            if(frequenceyStringMap.containsKey(frequencyString)){
                frequenceyStringMap.get(frequencyString).add(s);
            }else{
                List<String> stringList = new ArrayList<>();
                stringList.add(s);
                frequenceyStringMap.put(frequencyString, stringList);
            }
        }
        return new ArrayList<>(frequenceyStringMap.values());
    }

    private static String getFrequencyString(String s){
        s = s.toLowerCase();
        int[] charCount = new int[26];
        for(char c : s.toCharArray()){
            charCount[c - 'a']++;
        }
        StringBuffer frequencyString = new StringBuffer();
        char c = 'a';
        for(int j : charCount){
            frequencyString.append(c);
            frequencyString.append(j);
            c++;
        }
        return frequencyString.toString();
    }

}
