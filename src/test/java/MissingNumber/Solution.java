package MissingNumber;

class Solution {
    public static void main(String[] args) {
       int[] arraNums = new int[]{9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(arraNums));
    }

    public static int missingNumber(int[] nums) {

        int xor = 0, i = 0;
        for (i = 0; i < nums.length; i++) {
            xor = xor ^ i ^ nums[i];
        }

        return xor ^ i;
    }
}