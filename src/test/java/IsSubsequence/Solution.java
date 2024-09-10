package IsSubsequence;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution {

    public static Stream<Arguments> testMethodDataProvider() {
        return Stream.of(
                Arguments.of("abc", "ahbgdc", true),
                Arguments.of("axc", "ahbgdc", false),
                Arguments.of("aaaaaa", "bbaaaa", false)
        );
    }

    public boolean isSubsequenceInAnyOrder(String s, String t) {
        if (s.length() > t.length()){
            return false;
        }

        var subSeq = s.toCharArray();
        var subject = t.toCharArray();
        var indexIterationSubject = 0;
        var indexSeq = 0;
        var amountPresent = 0;

        for (; indexSeq <= subSeq.length-1; indexSeq++) {
            for (; indexIterationSubject <= t.length()-1; indexIterationSubject++) {
                if (subSeq[indexSeq] == subject[indexIterationSubject]) {
                    amountPresent++;
                    indexIterationSubject++;
                    break;
                }
            }
        }

        return subSeq.length==amountPresent;
    }

    @ParameterizedTest
    @MethodSource("testMethodDataProvider")
    void testMergeAlternately(String s, String t, boolean expected) {
        assertEquals(expected, isSubsequenceInAnyOrder(s,t));
    }

}
