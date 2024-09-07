package RootEqualsSumofChildren;
import AwesomeTreeNode.TreeNode;
/**
 *
 * Input: root = [10,4,6]
 * Output: true
 * Explanation: The values of the root, its left child, and its right child are 10, 4, and 6, respectively.
 * 10 is equal to 4 + 6, so we return true.
 *
 * */

class Solution {
    public static void main(String[] args) {
        var treeNode = new TreeNode(new Integer[]{10,4,6});
        System.out.println(treeNode.prettyPrint());
        System.out.println(checkTree(treeNode));;
    }
    public static boolean checkTree(TreeNode root) {
        var totalSum = 0;
        var headSum = root.val;

        if (root.left != null){
            totalSum = totalSum + getSum(root.left);
        }
        if (root.right != null) totalSum = totalSum + getSum(root.right);
        return totalSum == headSum;
    }

    static int getSum(TreeNode node){
        var totalSum = 0;
        totalSum = totalSum + node.val;
        if (node.left !=null) totalSum += getSum(node.left);
        if (node.right != null) totalSum += getSum(node.right);

        return totalSum;
    }
}
