package D3;

public class P7 {
    public static int fib(int n) {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }

    public static int hcf(int a, int b) {
        for (int i = Math.min(a, b); i >= 1; i--) {
            if (a % i == 0 && b % i == 0)
                return i;
        }
        return 1;
    }

    static int gcd(int a, int b) {
        while (a % b != 0) {
            int rem = a % b;
            a = b;
            b = rem;
        }
        return b;
    }

    public static void main(String[] args) {

//        fib(4);                                  //(5)sum of last two term(0 1 1 2 3 5 8 13 21 34 55 89 114 233 377...)
//        for (int i = 0; i < 15; i++) {
//            System.out.println(fib(i) + " ");
//        }

//        System.out.println(hcf(12, 18));            //que8
//        System.out.println(gcd(12, 18));            //que8

        System.out.println((int) (Math.log10(4323) + 1));        //que9 count digits of numbers

    }
}
