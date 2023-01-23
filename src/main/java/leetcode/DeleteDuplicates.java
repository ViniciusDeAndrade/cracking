package leetcode;

import java.util.*;

public class DeleteDuplicates {
    public ListNode deleteDuplicates(ListNode head) {
        List<Integer[]> result = new LinkedList<Integer[]>();


        ListNode curr = head;
        while (head.next != null) {
            if(head.val != head.next.val)
                head = head.next;
            else
                head = head.next;
        }
        return head;
    }
}
