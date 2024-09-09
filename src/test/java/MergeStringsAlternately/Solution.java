package MergeStringsAlternately;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution {

    public static Stream<Arguments> testMethodDataProvider() {
        return Stream.of(
                Arguments.of("abc", "pqr", "apbqcr"),
                Arguments.of("ab", "pqrs", "apbqrs"),
                Arguments.of("abcd", "pq", "apbqcd")
        );
    }

    public String mergeAlternately(String word1, String word2) {
        var wordOne = word1.toCharArray();
        var wordTwo = word2.toCharArray();
        var builder = new StringBuilder();

        for (int i = 0; i <= Math.max(wordOne.length, wordTwo.length)-1; i++) {

            if (i < wordOne.length){
                builder.append(wordOne[i]);
            }
            if (i < wordTwo.length){
                builder.append(wordTwo[i]);
            }
        }

        return builder.toString();
    }

    @ParameterizedTest
    @MethodSource("testMethodDataProvider")
    void testMergeAlternately(String word1, String word2, String expected) {
        assertEquals(expected,mergeAlternately(word1, word2));
    }


}
