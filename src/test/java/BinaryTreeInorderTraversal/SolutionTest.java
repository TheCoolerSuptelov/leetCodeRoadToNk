package BinaryTreeInorderTraversal;

import AwesomeTreeNode.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void testInorderTraversal() {
        List<Integer> result = solution.inorderTraversal(new TreeNode(new Integer[]{1, null, 2, 3}));

        Assertions.assertEquals(List.of(1, 3, 2), result);
    }

    @Test
    void testInorderTraversal_only_one_element() {
        List<Integer> result = solution.inorderTraversal(new TreeNode(new Integer[]{1}));

        Assertions.assertEquals(List.of(1), result);
    }

    @Test
    void testInorderTraversal_empty_node() {
        List<Integer> result = solution.inorderTraversal(new TreeNode());

        Assertions.assertTrue(result.isEmpty());
    }
}

