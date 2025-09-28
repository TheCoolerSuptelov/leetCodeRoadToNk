package FindMostFrequentVowelandConsonant;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution {


    @Test
    void findMostFrequentVowelandConsonant() {

        assertEquals(6, maxFreqSum("successes"));
        assertEquals(3, maxFreqSum("aeiaeia"));
    }


    public int maxFreqSum(String s) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        int[] freq = new int[26];

        final var charArray = s.toCharArray();
        for (char c : charArray) {
            freq[c - 'a']++;
        }

        int vowelsMax = 0;
        for (char vowel : vowels) {
            vowelsMax = Math.max(freq[vowel - 'a'], vowelsMax);
            freq[vowel - 'a'] = 0;
        }

        int notVowelsMax = 0;
        for (int notVowels : freq) {
            notVowelsMax = Math.max(notVowels, notVowelsMax);
        }

        return vowelsMax + notVowelsMax;
    }
}
