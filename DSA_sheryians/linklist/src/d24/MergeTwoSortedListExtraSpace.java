public class MergeTwoSortedListExtraSpace {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode temp = new ListNode(-1);
        ListNode head1 = l1, head2 = l2, dummy = temp;
        while (head1 != null || head2 != null) {
            if (head1 != null && head2 != null) {
                if (head1.val <= head2.val) {
                    dummy.next = new ListNode(head1.val);
                    head1 = head1.next;
                } else {
                    dummy.next = new ListNode(head2.val);
                    head2 = head2.next;
                }
            } else if (head1 != null) {
                dummy.next = new ListNode(head1.val);
                head1 = head1.next;
            } else if (head2 != null) {
                dummy.next = new ListNode(head2.val);
                head2 = head2.next;
            }
            dummy = dummy.next;
        }
        return temp.next;
    }
}
