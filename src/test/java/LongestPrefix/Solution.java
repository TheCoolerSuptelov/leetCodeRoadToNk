package LongestPrefix;

class Solution {
    public static void main(String[] args) {
        String[] xx = new String[]{"flower","flow","flight"};
        System.out.println(longestCommonPrefix(xx));
    }
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        var firstElement = strs[0].toCharArray();
        int nonEmptyLenght = firstElement.length;
        for (int i = 1; i < strs.length; i++) {
            if (nonEmptyLenght == 0) return "";
            var currentComprassion = strs[i].toCharArray();
            int minLenght = 0;
            if (firstElement.length > currentComprassion.length){
                minLenght = currentComprassion.length;
            }else {
                minLenght = firstElement.length;
            }
            if (minLenght < nonEmptyLenght)nonEmptyLenght=minLenght;
            for (int j=0;j < nonEmptyLenght; j++) {
                if(currentComprassion[j]==firstElement[j])continue;
                if(nonEmptyLenght>j)nonEmptyLenght=j;
            }
        }
        return String.copyValueOf(firstElement).substring(0,nonEmptyLenght);
    }
}