package LengthOfLastWord;

public class Solution {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World"));
    }
    public static int lengthOfLastWord(String s) {
        var xx = s.trim().split("(\\W+)");
        return xx[xx.length-1].length();
    }
}
