package HappyNumber;

class Solution {
    public static void main(String[] args) {
        System.out.println(isHappy(7));
    }

    public static boolean isHappy(int n) {
        if (n == 1) return true;
        var limiter = Integer.MAX_VALUE;
        while (n != 1 && limiter > 0) {
            int total = 0;
            for (int i = n, j = 1; i != 0; j++) {
                var iddqd = (int)(i % (Math.pow(10, j)));
                total = (int) (total + iddqd*iddqd);
                i = i / 10;
            }
            if (total == 1) {
                n = total;
                return true;
            }
            n = total;
            limiter--;
        }
        return false;
    }
}
