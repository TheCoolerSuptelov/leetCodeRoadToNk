package PartitioningIntoMinimumNumberOfDeciBinaryNumbers;

class Solution {
    public int minPartitions(String s) {
        int m = Integer.MIN_VALUE;
        for (int i = 0; i < s.length(); i++) {
            int temp = s.charAt(i) - '0';
            if (temp > m) {
                m = temp;
            }
        }
        return m;
    }
}
