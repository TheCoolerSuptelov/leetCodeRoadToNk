package Largest5digitnumberinaseries;

public class Solution {

    public static void main(String[] args) {
        System.out.println(solve("283910") == 83910);
        System.out.println(solve("1234567890") == 67890);
        System.out.println(solve("731674765") == 74765);
    }

    public static int solve(final String digits) {
        var curMax = Integer.MIN_VALUE;
        var digitsArr = digits.toCharArray();
        var concatString = new StringBuilder();
        var curLimiter = 0;
        var tempMax = Integer.MIN_VALUE;
        for (int i = 0; i < digitsArr.length; i++) {
            curLimiter = i+5 > digitsArr.length? digitsArr.length : i+5;
            for (int j = i; j < curLimiter; j++) {
                concatString.append(digitsArr[j]);
            }
            tempMax = Integer.valueOf(concatString.toString());
            if (curMax < tempMax)curMax = tempMax;
            concatString.setLength(0);
        }
        return curMax;
    }


}
