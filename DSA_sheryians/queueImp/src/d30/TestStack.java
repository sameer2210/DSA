public class TestStack {
    public static void main(String[] args) {
        // StackUsingArray st = new StackUsingArray(2);
        StackUsingLL st = new StackUsingLL();
        st.push(10);
        st.push(20);
        st.push(30);

        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        st.push(10);
        System.out.println(st.pop());
        System.out.println(st.pop());

    }
}
