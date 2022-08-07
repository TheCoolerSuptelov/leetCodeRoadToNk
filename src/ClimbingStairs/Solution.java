package ClimbingStairs;

public class Solution {
    public int climbStairs(int n) {
        int roadDecisionVariats[] = new int[n + 1];
        return climb_Stairs(0, n, roadDecisionVariats);
    }
    public int climb_Stairs(int curStep, int stairsLenght, int roadDecisionVariats[]) {
        if (curStep > stairsLenght) {
            return 0;
        }
        if (curStep == stairsLenght) {
            return 1;
        }
        if (roadDecisionVariats[curStep] > 0) {
            return roadDecisionVariats[curStep];
        }
        roadDecisionVariats[curStep] = climb_Stairs(curStep + 1, stairsLenght, roadDecisionVariats) + climb_Stairs(curStep + 2, stairsLenght, roadDecisionVariats);
        return roadDecisionVariats[curStep];
    }
}
