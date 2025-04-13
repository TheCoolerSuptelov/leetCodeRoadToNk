package ReverseDegreeOfString;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution {
    public static Stream<Arguments> dataProvider() {
        return Stream.of(Arguments.of("abc", 148));
    }

    public int reverseDegree(String s) {
        var charArr = s.toCharArray();
        var sum = 0;
        char alphabet = 'z';
        for (int i = 0; i < charArr.length; i++) {
            sum += (alphabet - charArr[i] + 1) * (i + 1);
        }
        return sum;
    }


    @ParameterizedTest
    @MethodSource("dataProvider")
    void given(String s, int expected) {
        var sut = new Solution();
        var actual = sut.reverseDegree(s);

        assertEquals(expected, actual);
    }
}
