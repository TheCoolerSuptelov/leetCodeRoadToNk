package ScoreAString;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution {
    public static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.of("hello", 13)
        );
    }

    public int scoreOfString(String s) {
        char[] charArray = s.toCharArray();
        var sum = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (i + 1 >= charArray.length) {
                return sum;
            }
            sum += Math.abs(charArray[i] - charArray[i+1]);
        }
        return 0;
    }


    @ParameterizedTest
    @MethodSource("dataProvider")
    void given(String aString, int score){
        var sut = new Solution();
        var actual = sut.scoreOfString(aString);
        assertEquals(score, actual);
    }
}
