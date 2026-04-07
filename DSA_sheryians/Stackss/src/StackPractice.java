import java.util.Stack;

public class StackPractice {
    static void Stack(Stack<Integer> st,int idx, int x){
        Stack<Integer> temp = new Stack<>();

        while(st.size()>idx){
            temp.push(st.pop());
        }
        st.push(x);
        while (temp.size()>0){
            st.push(temp.pop());
        }
    }
    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();
        stk.push(1);
        stk.push(2);
        stk.push(3);
        stk.push(4);
        stk.push(5);
        System.out.println("Stack before insertion :"+stk);
        Stack(stk,2,7);
        System.out.println("Stack after insertion :"+stk);
    }
}
