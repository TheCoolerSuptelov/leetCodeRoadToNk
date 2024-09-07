package LongestSubstringwithAtLeastKRepeatingCharacters;

import java.util.HashMap;

/*
* Given a string s and an integer k,
* return the length of the longest substring of s such that
* the frequency of each character in this substring is greater than or equal to k.
*Input: s = "aaabb", k = 3
Output: 3
Explanation: The longest substring is "aaa", as 'a' is repeated 3 times.
* * */
public class Solution {
    public static void main(String[] args) {
        System.out.println(longestSubstring("ababacb", 2));
    }
    public static int longestSubstring(String s, int k) {
        var hm = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0) + 1);
        }

        var maxSubstringLenght = 0;
        var curSubsString = 0;

        for (int i = 0; i < s.length(); i++) {
            if (hm.get(s.charAt(i))>= k){curSubsString++;continue;}
            if (curSubsString>maxSubstringLenght) maxSubstringLenght = curSubsString;
            curSubsString = 0;
        }
        if (curSubsString>maxSubstringLenght) maxSubstringLenght = curSubsString;
        return maxSubstringLenght;
    }
}
