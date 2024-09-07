package JewelsandStones;

public class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        var charArrStones = stones.toCharArray();
        var charArrJewels = jewels.toCharArray();
        var counter = 0;
        for (int i = 0; i < charArrStones.length; i++) {
            for (int j = 0; j < charArrJewels.length; j++) {
                if (charArrStones[i] == charArrJewels[j])counter++;
            }
        }
        return counter;
    }
}
