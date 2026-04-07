public class ReverseList {
    public static ListNode reverseLinkedList(ListNode head) {
        ListNode cur = head;
        ListNode prev = null;
        while (cur != null) {
            ListNode temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }
        return prev;
    }
    public static ListNode reverseLinkedListRec(ListNode head, ListNode cur, ListNode prev) {
        if(cur == null) {
            return prev;
        }
        ListNode temp = cur.next;
        cur.next = prev;
        prev = cur;
        cur = temp;
        return reverseLinkedListRec(cur, cur, prev);
    }
}
