package CountNodesEqualtoAverageofSubtree;

import AwesomeTreeNode.TreeNode;

/**
 * Input: root = [4,8,5,0,1,null,6]
 * Output: 5
 * Explanation:
 * For the node with value 4: The average of its subtree is (4 + 8 + 5 + 0 + 1 + 6) / 6 = 24 / 6 = 4.
 * For the node with value 5: The average of its subtree is (5 + 6) / 2 = 11 / 2 = 5.
 * For the node with value 0: The average of its subtree is 0 / 1 = 0.
 * For the node with value 1: The average of its subtree is 1 / 1 = 1.
 * For the node with value 6: The average of its subtree is 6 / 1 = 6.
 */


class Solution {
    public static void main(String[] args) {
        System.out.println(averageOfSubtree(new TreeNode(new Integer[]{4, 8, 5, 0, 1, null, 6})));
    }

    public static int averageOfSubtree(TreeNode root) {
        return avgCounter(root, 0);
    }

    static int avgCounter(TreeNode node, int counter) {
        var xx = sumOfAllElements(node) / countOfAllElements(node);
        if (node.val == (xx)) {
            counter++;
        }
        if (node.right != null) {
            var xxx = avgCounter(node.right, counter);
            counter = xxx;
        }
        if (node.left != null) {
            var xxxx = avgCounter(node.left, counter);
            counter = xxxx;
        }


        return counter;
    }

    static int sumOfAllElements(TreeNode node) {
        if (node == null) return 0;
        return node.val + sumOfAllElements(node.left) + sumOfAllElements(node.right);
    }

    static int countOfAllElements(TreeNode node) {
        if (node == null) return 0;
        return 1 + countOfAllElements(node.left) + countOfAllElements(node.right);
    }
}
