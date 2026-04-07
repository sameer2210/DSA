package D4;

import java.util.ArrayList;

public class P13 {
    public static void main(String[] args) {

//que 13 Factors of number

        int n = 100;
        ArrayList<Integer> list = new ArrayList<>();                 // to set in a order make a array list
/*
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                list.add(i);
//                System.out.println(i);
                if (i * i != n)
                    list.add(n / i);
//                    System.out.println(n / i);
            }
        }
        Collections.sort(list);
        System.out.println(list);
*/

        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
        for (int i = (int) Math.sqrt(n); i >= 1; i--) {
            if (n % i == 0 && i * i != n) {
                System.out.println(n / i);
            }
        }


    }
}
