package MaximumDepthofBinaryTree;

public class Solution {


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

        public int maxDepth(TreeNode root) {
            if(root == null) return 0;
            return max(maxDepth(root.right), maxDepth(root.left))+1;
        }

        public int max(int x, int y){
            return x>y?x:y;
        }
    }
}