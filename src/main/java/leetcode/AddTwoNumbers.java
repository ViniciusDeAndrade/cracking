package leetcode;

//nao feita ainda
public class AddTwoNumbers {
    public static void main(String[] args) {
//        ListNode l1 = [2, 4, 3];
//        ListNode l1 = [5, 6, 4];

    }

    public ListNode addTwoNum(ListNode l1, ListNode l2){
        ListNode result = new ListNode();
        result.val = l1.val + l2.val;

        var nextL1 = l1;
        var nextL2 = l2;
        if (l1.next != null) nextL1 = l1.next;
        if (l2.next != null) nextL2 = l2.next;


        return addTwoNum(nextL1, nextL2);
    }


    //  Definition for singly-linked list.
      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

}
