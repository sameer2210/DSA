package D5;

public class P15 {
    //count prime
    public static void main(String[] args) {
        int n = 23;
        System.out.println(isPrime(n));
    }

    private static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(n); i = i + 2) {
            if (n % i == 0)
                return false;
        }
        return true;
    }


}
