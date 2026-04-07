public class QUsingLL {
    ListNode front, rear;
    int size;

    QUsingLL() {
        front = null;
        rear = null;
        size = 0;
    }
    void enqueue(int n) {
        ListNode temp = new ListNode(n);
        if(rear == null) {
            front = temp;
            rear = temp;
            return;
        }
        rear.next = temp;
        rear = rear.next;
    }
    int dequeue() {
        if (front == null)
            return -1;
        int t = front.val;
        front = front.next;
        return t;
    }
    public void print() {
        BasicImpl.printList(front);
    }
}
