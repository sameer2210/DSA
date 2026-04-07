public class QUsingCircularArray {
    int arr[];
    int front, rear, length;
    QUsingCircularArray(int length) {
        arr = new int[length];
        front = rear = -1;
        this.length = length;
    }
    private boolean isEmpty() {
        return front == -1 && rear == -1;
    }
    private boolean isFull() {
        return (rear+1) % length == front;
    }
    void enqueue(int val) {
        if (isFull()) {
            System.out.println("FULL");
            return;
        }
        if (front == -1)
            front = 0;
        rear = (rear + 1) % length;
        arr[rear] = val;
    }
    Integer dequeue() {
        if (isEmpty())
            return null;
        int ans = arr[front];
        if(front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % length;
        }
        return ans;
    }
    public void print() {
        for(int i : arr)
            System.out.print(i + "  ");
        System.out.println();
    }
}
