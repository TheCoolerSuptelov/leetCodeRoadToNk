package ConvertDateBinary;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution {

    public String convertDateToBinary(String date) {

        var split = date.split("-");
        var resultSb = new StringBuilder();

        for (int i = 0; i < split.length; i++) {
            var sb = new StringBuilder();
            var num = Integer.valueOf(split[i]);
            while (num > 0) {
                sb.append(num % 2);
                num = num / 2;
            }
            sb.reverse();
            if (i+1 != split.length) {
                sb.append("-");
            }
            resultSb.append(sb);
        }

        return resultSb.toString();
    }

    @Test
    void test() {
        var actual = convertDateToBinary("2080-02-29");

        assertEquals("100000100000-10-11101", actual);
    }

}
