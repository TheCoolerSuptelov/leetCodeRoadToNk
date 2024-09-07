package MergeNodesinBetweenZeros;

import AwesomeListNode.ListNode;

/**
 * Example 1:
 * Input: head = [0,3,1,0,4,5,2,0]
 * Output: [4,11]
 * Explanation:
 * The above figure represents the given linked list. The modified list contains
 * - The sum of the nodes marked in green: 3 + 1 = 4.
 * - The sum of the nodes marked in red: 4 + 5 + 2 = 11.
 * <p>
 * Example 2:
 * Input: head = [0,1,0,3,0,2,2,0]
 * Output: [1,3,4]
 * Explanation:
 * The above figure represents the given linked list. The modified list contains
 * - The sum of the nodes marked in green: 1 = 1.
 * - The sum of the nodes marked in red: 3 = 3.
 * - The sum of the nodes marked in yellow: 2 + 2 = 4.
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(mergeNodes(ListNode.convertArrayToLinkedList(new int[]{0,1,0,3,0,2,2,0})).toString());
    }

    public static ListNode mergeNodes(ListNode head) {

        ListNode slow = head.next;
        ListNode fast = head.next;
        int sum = 0;
        while (fast != null) {
            sum += fast.val;
            if (fast.val == 0) {
                slow.val = sum;
                slow.next = fast.next;
                slow = slow.next;
                sum = 0;
            }
            fast = fast.next;
        }
        return head.next;
    }
}
