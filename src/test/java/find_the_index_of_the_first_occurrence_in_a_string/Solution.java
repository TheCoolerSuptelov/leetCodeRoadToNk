package find_the_index_of_the_first_occurrence_in_a_string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution {
    public int strStr(String haystack, String needle) {
        char[] strArr = haystack.toCharArray();
        char[] needleArr = needle.toCharArray();

        if (needleArr.length > strArr.length) {
            return -1;
        }

        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i] != needleArr[0]){
                continue;
            }

            boolean isSubstring = true;
            for (int k = 0; k <= needleArr.length-1; k++) {
                if (i+k > strArr.length - 1){
                    return -1;
                }
                if (strArr[i+k] != needleArr[k]){
                    isSubstring = false;
                }
            }
            if (isSubstring){
                return i;
            }
        }

        return -1;
    }


    @Test
    void given(){
        var qq = strStr("_sadbutsad", "sad");
        var qqs = strStr("sadbuts", "_sad");
        var qqsa = strStr("mississippi","issipi");

        assertEquals(1, qq);
        assertEquals(-1, qqs);
        assertEquals(-1, qqsa);
    }


}