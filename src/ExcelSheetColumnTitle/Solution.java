package ExcelSheetColumnTitle;

public class Solution {
    public static void main(String[] args) {
        System.out.println(convertToTitle(
                701 ));
    }
    public static String convertToTitle(int columnNumber) {
        var strBuilder = new StringBuilder();
        while (columnNumber>0){
            if (columnNumber%26==0){strBuilder.append('Z');columnNumber/=26;--columnNumber;continue;}
            strBuilder.append((char)(columnNumber%26+64));
            columnNumber/=26;
        }
        return strBuilder.reverse().toString();
    }
}
