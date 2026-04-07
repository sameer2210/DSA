import java.util.Stack;

public class StackRecursionInsertion {

    static void pushBottom(Stack<Integer> st, int x) {
        if (st.size() == 0) {
            st.push(x);
            return;
        }
        int top = st.pop();
        pushBottom(st, x);
        st.push(top);
    }

    public static void main(String[] args) {


//        int x = 7;
        Stack<Integer> st = new Stack<>();
        st.add(1);
        st.add(2);
        st.add(3);
        st.add(4);
        int x = 7;

        pushBottom(st, x);
        System.out.println(st);


    }
}
