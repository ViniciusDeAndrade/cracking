package leetcode;

public class MergeTwoSortedLists {
    public static void main(String[] args) {

    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null) return  list2;
        if(list2 == null) return list1;

        ListNode result;

        if(list1.val > list2.val) {
            result = list1;
            list1 = list1.next;
        } else {
            result = list2;
            list2.next = list2;
        }

        result.next = mergeTwoLists(list1, list2);
        return result;
    }

    public ListNode mergeTwoListsInteractive(ListNode list1, ListNode list2) {
        if(list1 == null) return  list2;
        if(list2 == null) return list1;

        ListNode merge = new ListNode();
        while (list1 != null && list2 != null) {
            if(list1.val > list2.val) {
                merge = list1;
                list1 = list1.next;
            } else {
                merge = list2;
                list2.next = list2;
            }
        }
        return merge;
    }
}
