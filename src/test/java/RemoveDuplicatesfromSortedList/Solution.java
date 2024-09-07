package RemoveDuplicatesfromSortedList;


class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) return head;
        var curNodes = head;
        while (curNodes.next != null){
            if (curNodes.val == curNodes.next.val){
                curNodes.next = curNodes.next.next;
            }else{
                curNodes  = curNodes.next;
            }
        }
        return head;
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
