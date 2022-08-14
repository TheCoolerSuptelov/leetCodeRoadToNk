package MaximumNumberofWordsFoundinSentences;

class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for (int i = 0; i < sentences.length; i++) {
            String[] newStr = sentences[i].split("\s+");
            if (newStr.length > max) max = newStr.length;
        }
        return max;
    }
}
