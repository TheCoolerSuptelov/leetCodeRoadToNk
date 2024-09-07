package KidsWithGreatesAmountOfCandy;

import java.util.ArrayList;
import java.util.List;


    class Solution {
        public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
            var maxCandy = 0;
            for (int i = 0; i < candies.length; i++) {
                if (candies[i] > maxCandy) maxCandy=candies[i];
            }
            List<Boolean> distributionList = new ArrayList<Boolean>(candies.length-1);

            for (int i = 0; i < candies.length; i++) {
                distributionList.add((candies[i]+extraCandies)>=maxCandy);
            }
            return distributionList;
        }
    }

