package CountAndSay;

class Solution {

    public static String countAndSay(int n) {
        String start = "1";
        if (n == 0) return "";
        if (n == 1) return start;
        int count = 0;
        char say = '1';
        for (int i = 2; i <= n; i++) {
            say = start.charAt(0);
            count = 1;
            StringBuilder sb = new StringBuilder();
            for (int j = 1; j < start.length(); j++) {
                if (start.charAt(j) == start.charAt(j - 1)) {
                    count++;
                } else {
                    sb.append(count).append(say);
                    count = 1;
                    say = start.charAt(j);
                }
            }
            sb.append(count).append(say);
            start = sb.toString();
        }
        return start;
    }
}