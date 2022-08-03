package LongestSubstringWithoutRepeatingCharacters;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int longestSequence = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0, j = 0; j < n; j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
            }
            longestSequence = Math.max(longestSequence, j - i + 1);
            map.put(s.charAt(j), j + 1);
        }
        return longestSequence;
    }
}
