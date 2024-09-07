package CountItemsMatchingaRule;


import java.util.List;
import java.util.Objects;

/**
 * Input: items = [["phone","blue","pixel"],["computer","silver","lenovo"],["phone","gold","iphone"]], ruleKey = "color", ruleValue = "silver"
 * Output: 1
 * Explanation: There is only one item matching the given rule, which is ["computer","silver","lenovo"].
 */
class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int ruleIndex = 0;
        if (Objects.equals(ruleKey, "color")) ruleIndex = 1;
        if (Objects.equals(ruleKey, "name")) ruleIndex = 2;
        int totalCounter = 0;
        for (List<String> item : items) {
            if (item.get(ruleIndex).equals(ruleValue)) totalCounter++;
        }
        return totalCounter;
    }
}
