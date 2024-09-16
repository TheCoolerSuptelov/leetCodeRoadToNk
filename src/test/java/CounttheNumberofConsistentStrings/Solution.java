package CounttheNumberofConsistentStrings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution {

    public int countConsistentStrings(String allowed, String[] words) {

        var res = 0;
        for(String word : words) {
            var charArr = word.toCharArray();
            var countCorrect = 0;

            for (int i = 0; i < charArr.length; i++) {

                if (allowed.indexOf(charArr[i]) != -1){
                    countCorrect++;
                }
            }
            if (countCorrect == word.length()){
                res += 1;
            }


        }
        return res;
    }

    @Test
    public void test1() {

        var ex = countConsistentStrings("ab",new String[]{"ad","bd","aaab","baa","badab"});
        assertEquals(ex, 2);
    }

}
