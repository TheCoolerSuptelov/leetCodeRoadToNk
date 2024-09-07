package SequentialDigits;

import java.util.ArrayList;
import java.util.List;


class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        String digits = "123465789";
        List<Integer> result = new ArrayList<>();
        var highLenght = String.valueOf(high).length();
        var initialLenght = String.valueOf(low).length();
        for (int lenght = initialLenght; lenght <= highLenght; lenght++) {
            for (int i = 0; i + lenght <= digits.length();i++){
                int value = Integer.parseInt(digits.substring(i, i + lenght));
                if (value >= low && value <= high){
                    result.add(value);
                }
            }
        }
        return result;
    }
}
