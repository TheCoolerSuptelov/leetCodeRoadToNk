package KthSmallestElementInBST;

import AwesomeTreeNode.TreeNode;
import java.util.ArrayList;
import java.util.List;

class Solution {
    public static void main(String[] args) {
        var root = new TreeNode(new Integer[]{3,1,4,null,2});
        System.out.println(kthSmallest(root, 1));
    }
    public static int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> resArr = new ArrayList<>();
        doStuff(root, resArr);
        resArr.sort((o1, o2) -> o1-o2);
        return resArr.get(k-1);
    }

    public static void doStuff(TreeNode root, List<Integer> resultedArr){
        if (root == null) return;
        resultedArr.add(root.val);
        doStuff(root.left, resultedArr);
        doStuff(root.right, resultedArr);
    }
}