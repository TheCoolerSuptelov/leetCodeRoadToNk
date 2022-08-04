package JumpGame;

public class Solution {
    public static void main(String[] args) {
        int[] testArrayTrue = new int[]{2,5,0,0};
        int[] testArrayfalse = new int[]{3,2,1,0,4};
        System.out.println(canJump(testArrayTrue));
        System.out.println(canJump(testArrayfalse));
    }

    public static boolean canJump(int[] nums) {
        var elementsInArray = nums.length -1;
        if (elementsInArray == 0)return true;
        for (int i = 0; i <= elementsInArray;) {
            if (i>=elementsInArray)return true;
            var curJump = nums[i];
            if (curJump == 0)return false;
            i += curJump;
        }
        return true;
    }

}
