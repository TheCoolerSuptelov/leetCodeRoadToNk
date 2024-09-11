package BestTimetoBuyandSellStock_1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution {

    public static Stream<Arguments> testMethodDataProvider() {
        return Stream.of(
                Arguments.of(new int[]{7, 1, 5, 3, 6, 4}, 5),
                Arguments.of(new int[]{7, 6, 4, 3, 1}, 0)
        );
    }

    public int maxProfit(int[] prices) {

        var maxProfit = 0;
        for (int i = 0; i <= prices.length - 1; i++) {
            for (int j = i + 1; j <= prices.length - 1; j++) {
                maxProfit = Math.max(maxProfit, prices[j] - prices[i]);
            }
        }

        return maxProfit;
    }

    @ParameterizedTest
    @MethodSource("testMethodDataProvider")
    void testMergeAlternately(int[] arr, int expectedBabkiStocks) {
        assertEquals(expectedBabkiStocks, maxProfit(arr));
    }
}
