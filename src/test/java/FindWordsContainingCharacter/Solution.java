package FindWordsContainingCharacter;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        var res = new ArrayList<Integer>();
        for(int i = 0; i < words.length;i++){

            var curElement = words[i];

            if (curElement.indexOf(x) != -1){
                res.add(i);
            }

        }

        return res;
    }


    @Test
    void test(){
        var res = findWordsContaining(new String[]{"leet","code"}, 'e');
    }
}
