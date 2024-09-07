package MaximumBinaryTree;

import AwesomeTreeNode.TreeNode;
/**
 *
 * Input: nums = [3,2,1,6,0,5]
 * Output: [6,3,5,null,2,0,null,null,1]
 * Explanation: The recursive calls are as follow:
 * - The largest value in [3,2,1,6,0,5] is 6. Left prefix is [3,2,1] and right suffix is [0,5].
 *     - The largest value in [3,2,1] is 3. Left prefix is [] and right suffix is [2,1].
 *         - Empty array, so no child.
 *         - The largest value in [2,1] is 2. Left prefix is [] and right suffix is [1].
 *             - Empty array, so no child.
 *             - Only one element, so child is a node with value 1.
 *     - The largest value in [0,5] is 5. Left prefix is [0] and right suffix is [].
 *         - Only one element, so child is a node with value 0.
 *         - Empty array, so no child.
 *
 * */
class Solution {
    public static void main(String[] args) {
        System.out.println(constructMaximumBinaryTree(new int[]{3,2,1,6,0,5}).prettyPrint());
    }
    public static TreeNode constructMaximumBinaryTree(int[] nums) {

        return constructNode(nums, 0, nums.length);
    }

    static TreeNode constructNode(int[] nums, int startingIndex, int limitIndex){
        if (startingIndex == limitIndex)return null;
        var curMax = max(nums, startingIndex, limitIndex);
        if (curMax == -1)return null;
        var head = new TreeNode(nums[curMax]) ;
        head.left = constructNode(nums, startingIndex, curMax);
        head.right = constructNode(nums, curMax+1, limitIndex);
        return  head;
    }

    static int max(int[] nums, int startingIndex, int limitIndex){
        var max = startingIndex;
        for (int i = startingIndex; i < limitIndex; i++) {
            if (nums[i] > nums[max])max=i;
        }
        return max;
    }
}