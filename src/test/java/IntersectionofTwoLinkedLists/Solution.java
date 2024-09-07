package IntersectionofTwoLinkedLists;

import java.util.HashMap;

public class Solution {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) return null;
        ListNode curA = headA;
        ListNode curB = headB;
        int count = 0;
        while(curA != curB){
            if(count == 2) break;
            if(curA == null) count++;
            curA = curA == null ? headB : curA.next;
            curB = curB == null ? headA : curB.next;
        }
        return (curA == curB) ? curA : null;
    }

}
