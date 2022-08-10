package LinkedListCycle;

import java.awt.*;
import java.util.HashMap;
import java.util.List;

public class Solution {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public boolean hasCycle(ListNode head) {
        if(head == null)return false;
        HashMap<ListNode, Integer> appearanceListNodes = new HashMap<>();
        while (head.next !=null){
            if (null != appearanceListNodes.get(head)){
                return true;
            }
            appearanceListNodes.put(head, 0);
            head = head.next;
        }
        return false;
    }

}
