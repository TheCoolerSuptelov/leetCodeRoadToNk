package SplitStringInBalancedStrings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution {


    @Test
    void splitStringInBalancedStrings() {

        assertEquals(1, balancedStringSplit("RL"));
        assertEquals(4, balancedStringSplit("RLRRLLRLRL"));
        assertEquals(2, balancedStringSplit("RLRRRLLRLL"));
    }


    public int balancedStringSplit(String s) {
        char[] chars = s.toCharArray();
        int lCounter = 0;
        int rCounter = 0;

        int balanceCounter = 0;
        char l = 'L';
        char r = 'R';

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == l) {
                lCounter++;
            }
            if (chars[i] == r) {
                rCounter++;
            }
            if (lCounter==rCounter) {
                balanceCounter++;
            }
        }

        return balanceCounter;
    }
}
