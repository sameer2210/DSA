package d1;

import java.util.LinkedList;

public class MyLinkList {
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
    public static void printRecursive(ListNode head) {
        if(head == null) {
            System.out.println("null");
            return;
        }
        System.out.print(head.val + " -> ");
        printRecursive(head.next);
    }
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }
    public static int size(ListNode head) {
        int size = 0;
        while (head != null) {
            size++;
            head = head.next;
        }
        return size;
    }
    public static int linearSearch(ListNode head, int key) {
        int index = -1;
        while (head != null) {
            index++;
            if(head.val == key)
                return index;
            head = head.next;
        }
        return -1;
    }
    public static ListNode insertFirst(ListNode head, int val) {
        ListNode newNode = new ListNode(val);
        newNode.next = head;
        head = newNode;
        return head;

    }
    public static ListNode insertLast(ListNode head, int val) {
        ListNode newNode = new ListNode(val);
        if(head == null)
            return newNode;
        ListNode temp = head;
        while (head.next != null) {
            head = head.next;
        }

        head.next = newNode;
        return temp;
    }
    public static ListNode deleteFirst(ListNode head) {
        return head == null ? null : head.next;
    }
    public static ListNode deleteLast(ListNode head) {
        if(head == null || head.next == null)
            return null;
        ListNode temp = head;
        while (head.next.next != null) {
            head = head.next;
        }
        head.next = null;
        return temp;
    }
    public static ListNode insertAtIndex(ListNode head, int index, int val) {
        int size = size(head);
        if(index > size || index < 0)
            throw new IndexOutOfBoundsException("invalid index " + index + " for size : " + size);
        if(index == 0)
            return insertFirst(head, val);
        if(index == size)
            return insertLast(head, val);
        ListNode newNode = new ListNode(val);
        ListNode temp = head;

        while (index-- > 1)
            head = head.next;

        ListNode next = head.next;
        head.next = newNode;
        newNode.next = next;
        return temp;
    }
    public static ListNode deleteAtIndex(ListNode head, int index) {
        if(index >=  size(head))
            throw new IndexOutOfBoundsException("invalid index " + index + " for size : " + size(head));
        if(index == 0)
            return deleteFirst(head);
        ListNode temp = head;
        while (index-- > 1) {
            head = head.next;
        }
        head.next = head.next.next;
        return temp;
    }

    public static void main(String[] args) {
        ListNode head = buildList();
        head = deleteFirst(head);


    }
}