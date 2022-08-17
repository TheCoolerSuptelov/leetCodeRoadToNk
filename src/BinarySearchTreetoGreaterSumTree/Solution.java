package BinarySearchTreetoGreaterSumTree;

import AwesomeTreeNode.TreeNode;
import java.util.ArrayList;

class Solution {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(new Integer[]{4, 1, 6, 0, 2, 5, 7, null, null, null, 3, null, null, null, 8});
        System.out.println(bstToGst(root).prettyPrint());

    }

    public static TreeNode bstToGst(TreeNode root) {

        changeValueToTreeNode(root);

        return root;

    }

    static void changeValueToTreeNode(TreeNode node) {

        ArrayList<Integer> arrr = new ArrayList<>();
        fillArray(node, arrr);
        calculateNewValue(node, arrr);
    }

    static void calculateNewValue(TreeNode node, ArrayList<Integer> arrr) {
        if (node == null) return;
        node.val = arrr.stream().filter(e -> e >= node.val).mapToInt(Integer::valueOf).sum();
        calculateNewValue(node.left, arrr);
        calculateNewValue(node.right, arrr);
    }

    static void fillArray(TreeNode node, ArrayList<Integer> arrr) {
        if (node == null) return;
        arrr.add(node.val);
        fillArray(node.right, arrr);
        fillArray(node.left, arrr);
    }

}