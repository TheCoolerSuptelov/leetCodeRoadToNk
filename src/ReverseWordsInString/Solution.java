package ReverseWordsInString;

public class Solution {

    public static void main(String[] args) {
        var testString = new String("a good   example");
        System.out.println(reverseWords(testString));
    }

    public static String reverseWords(String s) {
        if (s.isEmpty() | s.isBlank())return "" ;
        var xx = s.split("\\b\\b");
        var strBuilder = new StringBuffer();
        for (int i = xx.length-1; i >= 0 ; i--) {
            if (xx[i].isEmpty())continue;
            if (xx[i].contains(" "))continue;
            strBuilder.append(xx[i]);
            strBuilder.append(" ");
        }
        return strBuilder.toString().trim();
    }

}
