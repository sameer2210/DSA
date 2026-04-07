public class MiddleOfListCount {
    public ListNode middleNode(ListNode head) {
        int length = 1;
        ListNode node = head;
        while (node.next != null) {
            length++;
            node = node.next;
        }
        System.out.println(length);
        node = head;
        length = length / 2 + 1;
        for (int i = 1; i < length; i++) {
            node = node.next;
        }
        return node;
    }
}
