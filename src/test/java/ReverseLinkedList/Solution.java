package ReverseLinkedList;


class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null) return head;
        if (head.next == null) return head;


        ListNode node = head, prev = null, reversed = null;

        while (node != null) {
            final ListNode next = node.next;

            if (node.next == null) {
                reversed = node;
            }
            node.next = prev;
            prev = node;
            node = next;
        }

        return reversed;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}