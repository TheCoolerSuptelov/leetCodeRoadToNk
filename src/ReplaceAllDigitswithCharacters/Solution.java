package ReplaceAllDigitswithCharacters;
/**
 *
 * Input: s = "a1c1e1"
 * Output: "abcdef"
 * Explanation: The digits are replaced as follows:
 * - s[1] -> shift('a',1) = 'b'
 * - s[3] -> shift('c',1) = 'd'
 * - s[5] -> shift('e',1) = 'f'
 *
 *
 * */
class Solution {
    public String replaceDigits(String s) {
        char[] charArray = s.toCharArray();
        for(int i = 1; i<charArray.length; i = i + 2) {
            charArray[i] = (char) (charArray[i - 1] + charArray[i] - '0');
        }
        return String.valueOf(charArray);
    }
}