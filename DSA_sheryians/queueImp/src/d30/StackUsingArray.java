public class StackUsingArray {
    int[] arr;
    int length;
    int top;

    StackUsingArray(int length) {
        arr = new int[length];
        this.length = length;
        top = -1;
    }
    public void push(int val) {
        if(top  == length - 1) {
            System.out.println("OVERFLOW");
            return;
        }
        arr[++top] = val;
    }
    public Integer pop() {
        if(top == -1)
            return null;
        return arr[top--];
    }
    public Integer peek() {
        if(top == -1)
            return null;
        return arr[top];
    }
}
