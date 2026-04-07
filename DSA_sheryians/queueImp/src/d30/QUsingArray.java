public class QUsingArray {
    int arr[];
    int length;
    int rear;

    QUsingArray(int length) {
        arr = new int[length];
        this.length = length;
        rear = -1;
    }
    public void enqueue(int val) {
        if(rear == length-1) {
            System.out.println("FULL");
            return;
        }
        arr[++rear] = val;
    }
    public Integer dequeue() {
        if(rear == -1){
            return null;
        }
        int ans = arr[0];
        for(int i = 0; i < rear; i++)
            arr[i] = arr[i+1];
        rear--;
        return ans;
    }
    public void print() {
        for(int i : arr)
            System.out.print(i + "  ");
        System.out.println();
    }
}
