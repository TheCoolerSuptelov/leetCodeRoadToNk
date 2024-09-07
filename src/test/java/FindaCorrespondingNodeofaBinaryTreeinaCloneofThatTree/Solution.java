package FindaCorrespondingNodeofaBinaryTreeinaCloneofThatTree;

import AwesomeTreeNode.TreeNode;

public class Solution {

    public static void main(String[] args) {
        var tt = new TreeNode(new Integer[]{8,null,6,null,5,null,4,null,3,null,2,null,1});
        var tt1 = new TreeNode(new Integer[]{8,null,6,null,5,null,4,null,3,null,2,null,1});
        System.out.println(tt.prettyPrint());
        System.out.println("=======================" + "\n" + getTargetCopy(tt, tt1, new TreeNode(4)).toString());
    }

    public static final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {

        return findSameNode(cloned, target);

    }

    public static TreeNode findSameNode(TreeNode cloned, TreeNode target) {
        if (cloned.val == target.val) {
            return cloned;
        }
        TreeNode val1 = null;
        if (cloned.left!=null){
            val1 = findSameNode(cloned.left, target);
        }

        TreeNode val2 = null;
        if (cloned.right!=null){
            val2 = findSameNode(cloned.right, target);
        }

        return val1==null?val2:val1;
    }

}
