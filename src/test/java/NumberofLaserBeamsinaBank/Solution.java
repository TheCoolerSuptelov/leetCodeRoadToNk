package NumberofLaserBeamsinaBank;
/***
 *
 * Input: bank = ["011001","000000","010100","001000"]
 * Output: 8
 * Explanation: Between each of the following device pairs, there is one beam. In total, there are 8 beams:
 *  * bank[0][1] -- bank[2][1]
 *  * bank[0][1] -- bank[2][3]
 *  * bank[0][2] -- bank[2][1]
 *  * bank[0][2] -- bank[2][3]
 *  * bank[0][5] -- bank[2][1]
 *  * bank[0][5] -- bank[2][3]
 *  * bank[2][1] -- bank[3][2]
 *  * bank[2][3] -- bank[3][2]
 *
 * */
public class Solution {
    public static void main(String[] args) {
        System.out.println(numberOfBeams(new String[]{"011001","000000","010100","001000"}));
    }
    public static int numberOfBeams(String[] bank) {
        var countBeams = 0;
        var prevBeams = 0;
        var curBeams = 0;
        for (int i = 0; i < bank.length; i++) {
            var charArr = bank[i].toCharArray();
            for (int j = 0; j < charArr.length; j++) {
                if (charArr[j] == '1') curBeams++;
            }
            if (curBeams == 0 ) continue;
            countBeams += prevBeams * curBeams;
            prevBeams = curBeams;
            curBeams = 0;
        }
        return countBeams;
    }

}
