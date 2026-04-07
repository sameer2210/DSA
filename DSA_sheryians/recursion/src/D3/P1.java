package D3;

public class P1 {
    public static void fn(int n) {
        if (n == 0) return;
        fn(n - 1);                          //Que2  first store all value in stack then print
        System.out.println(n);
//        fn(n - 1);                          //Que3
    }

    public static void tn(int n) {
        System.out.println(n);
        if (n == 1) {
            return;
        }
        tn(n - 1);                          //Que3
    }

    public static int sod(int n) {
        if (n <= 9)
            return n;
//        return n % 10 + sod(n / 10);          //or
        int tem = n % 10;
        int rem = sod(n / 10);
        return tem + rem;
    }

    public static int sod(int n, int rev) {
        if (n == 0)
            return rev;
        int temp = n % 10;
        rev = rev * 10 + temp;
        return sod(n / 10, rev);
    }

    public static void main(String[] args) {
//        fn(5);                            //que2,3
//        tn(5);                           //que3
//        System.out.println(sod(150));
        System.out.println(sod(3, 3));

    }
}
