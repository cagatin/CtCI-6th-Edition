package Ch_02_LinkedLists.Q1_Remove_Dups;

import Ch_02_LinkedLists.ListNode;

public class Question1 {
    public ListNode removeDups(ListNode head) {
        ListNode curr = head;
        while (curr != null && curr.next != null) {
            if (curr.val == curr.next.val) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode L = new ListNode(1);
        L.next = new ListNode(1);
        L.next = new ListNode(1);

    }
}
