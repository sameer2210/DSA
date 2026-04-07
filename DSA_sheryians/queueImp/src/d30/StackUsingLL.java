public class StackUsingLL {
    ListNode head;

    StackUsingLL() {
        head = null;
    }
    void push(int val) {
        ListNode t = new ListNode(val);
        t.next = head;
        head = t;
    }
    Integer pop() {
        if(head == null) {
            return null;
        }
        int t = head.val;
        head = head.next;
        return t;
    }
    Integer peek() {
        if(head == null){
            return null;
        }
        return head.val;
    }
}
