package DeepestLeavesSum;

import AwesomeTreeNode.TreeNode;

public class Solution {

    public static void main(String[] args) {
        var tt = new TreeNode(new Integer[]{6, 7, 8, 2, 7, 1, 3, 9, null, 1, 4, null, null, null, 5});

        System.out.println(tt.prettyPrint());
        System.out.println("********************************************");

    }

    private int depth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(depth(root.left), depth(root.right));
    }

    private int count(TreeNode root, int curDep, int depth) {
        if (root == null) return 0;

        if (curDep == depth) {
            return root.val;
        }
        return count(root.left, curDep + 1, depth) + count(root.right, curDep + 1, depth);
    }

    public int deepestLeavesSum(TreeNode root) {
        int dep = depth(root);

        return count(root, 1, dep);

    }

}
