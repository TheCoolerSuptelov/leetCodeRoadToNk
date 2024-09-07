package RangeSumofBST;

import AwesomeTreeNode.TreeNode;

/*
 *
 * Input: root = [10,5,15,3,7,null,18], low = 7, high = 15
 * Output: 32
 * Explanation: Nodes 7, 10, and 15 are in the range [7, 15]. 7 + 10 + 15 = 32.
 *
 */
public class Solution {
    public static void main(String[] args) {
        TreeNode testNode = new TreeNode(new Integer[]{10, 5, 15, 3, 7, null, 18});
        var low = 7;
        var high = 15;
        System.out.println(rangeSumBST(testNode,low, high));
    }

    public static int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null) return 0;
        if (root.val >= low && root.val <= high)
            return root.val + rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high);

        return rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high);
    }
}
