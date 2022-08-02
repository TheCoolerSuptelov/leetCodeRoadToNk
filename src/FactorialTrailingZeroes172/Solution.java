package FactorialTrailingZeroes172;

class Solution {
    public int trailingZeroes(int n) {
        int amountOfZeros = 0;
        while (n > 0) {
            n /= 5;
            amountOfZeros += n;
        }
        return amountOfZeros;
    }
}