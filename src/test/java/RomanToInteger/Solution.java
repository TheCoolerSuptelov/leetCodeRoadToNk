package RomanToInteger;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution {

    public static Stream<Arguments> testMethodDataProvider() {
        return Stream.of(
                Arguments.of("MCMXCIV", 1994),
                Arguments.of("LVIII", 58),
                Arguments.of("I", 1),
                Arguments.of("V", 5),
                Arguments.of("IV", 4),
                Arguments.of("VI", 6),
                Arguments.of("CM", 900)
        );
    }

    public int romanToInt(String s) {
        var romanToDecimal = Map.of('I',1,'V',5,'X',10,'L',50,'C',100,'D',500,'M',1000);

        var romans = s.toCharArray();
        var sum = 0;

        var nxtVal = 0;
        for (int i = 0; i < romans.length; i++) {
            var decimalRepresentationOfRoman = romanToDecimal.get(romans[i]);
            if (i+1 < romans.length) {
                nxtVal = romanToDecimal.get(romans[i+1]);
            } else {
                nxtVal = 0;
            }

            if (nxtVal > decimalRepresentationOfRoman){
                sum = sum + (nxtVal - decimalRepresentationOfRoman);
                i++;
                continue;
            }

            sum += decimalRepresentationOfRoman;
        }

        return sum;
    }

    @ParameterizedTest
    @MethodSource("testMethodDataProvider")
    void testMergeAlternately(String roman, int expected) {
        assertEquals(expected, romanToInt(roman));
    }


}
