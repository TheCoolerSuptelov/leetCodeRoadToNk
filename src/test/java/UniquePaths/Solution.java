package UniquePaths;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution {
    public static Stream<Arguments> dataProvider() {
        return Stream.<Arguments>builder()
                .add(Arguments.of(3,7,28))
                .add(Arguments.of(3,2,3))
                .build();
    }

    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        Arrays.stream(dp).forEach(A -> Arrays.fill(A, 1));

        for (int i = 1; i < m; ++i)
            for (int j = 1; j < n; ++j)
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];

        return dp[m - 1][n - 1];
    }


    @ParameterizedTest
    @MethodSource("dataProvider")
    void given(int m, int n, int expected){
        var sut = new Solution();

        var actual = sut.uniquePaths(m,n);

        assertEquals(actual, expected);

    }
}
