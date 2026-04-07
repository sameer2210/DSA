public class QUsingCircularArray {

    int arr[];
    int front, rear, length;

    QUsingCircularArray(int length) {
        arr = new int[length];
        front = rear = -1;
        this.length = length;
    }

    private boolean isFull() {
        return (rear + 1) % length == -1 && rear == 1;
    }

    void enqueue(int val) {
        if (isFull()) {
            System.out.println("full");
            return;
        }
        if (front == -1) {
            front = 0;
            rear = (rear + 1 % length);
            arr[rear] = val;
        }
    }


}