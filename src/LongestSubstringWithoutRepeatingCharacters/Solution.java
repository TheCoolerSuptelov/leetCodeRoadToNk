package LongestSubstringWithoutRepeatingCharacters;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int longestSequence = 0;
        Map<Character, Integer> currentCharactersPosition = new HashMap<>();
        for (int startSubstringWithoutRepeat = 0, iterator = 0; iterator < n; iterator++) {
            var curChar = s.charAt(iterator);
            if (currentCharactersPosition.containsKey(curChar)) {
                startSubstringWithoutRepeat = Math.max(currentCharactersPosition.get(curChar), startSubstringWithoutRepeat);
            }
            longestSequence = Math.max(longestSequence, iterator - startSubstringWithoutRepeat + 1);
            currentCharactersPosition.put(curChar, iterator + 1);
        }
        return longestSequence;
    }
}
