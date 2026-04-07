public class BasicImpl {
    private static ListNode buildList() {

        ListNode n1 = new ListNode(10);
        ListNode n2 = new ListNode(20);
        ListNode n3 = new ListNode(30);
        ListNode n4 = new ListNode(40);
        ListNode n5 = new ListNode(50);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        return n1;
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    private static void printListRecursive(ListNode head) {
        if (head == null) {
            System.out.println();
            return;
        }
        System.out.print(head.val + " ");
        printListRecursive(head.next);
    }

    private static int size(ListNode head) {
        int c = 0;
        while (head != null) {
            c++;
            head = head.next;
        }
        return c;
    }

    private static boolean search(ListNode head, int element) {
        while (head != null) {
            if (head.val == element)
                return true;
            head = head.next;
        }
        return false;
    }

    private static ListNode insertFirst(ListNode head, int element) {
        ListNode node = new ListNode(element);
        if (head == null)
            return node;
        node.next = head;
        return node;
    }

    private static ListNode insertLast(ListNode head, int element) {
        ListNode temp = head;
        ListNode nn = new ListNode(element);
        if(head == null)
            return nn;
        while (temp.next != null)
            temp = temp.next;
        temp.next = nn;
        return head;
    }

    private static ListNode deleteFirst(ListNode head) {
        if (head == null)
            return null;
        return head.next;
    }

    private static ListNode deleteLast(ListNode head) {
        if (head == null || head.next == null)
            return null;
        ListNode temp = head;
        while (temp.next.next != null)
            temp = temp.next;
        temp.next = null;
        return head;
    }

    private static ListNode insert(ListNode head, int pos, int elememnt) {
        ListNode node = new ListNode(elememnt);
        if (pos == 1) {
            node.next = head;
            return node;
        }
        ListNode temp = head;
        for (int i = 1; i <= pos - 2 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null)
            return head;
        node.next = temp.next;
        temp.next = node;
        return head;
    }

    private static ListNode delete(ListNode head, int pos) {
        if (pos == 1) {
            return head.next;
        }
        ListNode temp = head;
        for (int i = 1; i <= pos - 2 && temp.next != null; i++) {
            temp = temp.next;
        }
        if(temp.next == null)
            return head;
        temp.next = temp.next.next;
        return head;
    }

    public static void main(String[] args) {
        ListNode head = buildList();
        printList(head);
        printListRecursive(head);



        //head = insertFirst(head, 500);
        //head = insertLast(head, 500);
        //System.out.println(search(head, 500));
        //head = deleteFirst(head);
        //head = deleteLast(head);
        //head = insert(head, 4, 80);
//        head = delete(head, 3);
//        printList(head);
//        System.out.println(size(head));

    }


}
