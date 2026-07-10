package Maths;
import java.util.*;

public class Que {
    public static void main (String []args) {

        //count a no.
//        int n = 12345678;
//        String str = String.valueOf(n);
//            int count =0;
//        for (int i = 1; i <= str.length(); i++) {
//            count++;
//        }
//        System.out.println(count);


        //reverse a no.
//        int n = 12345;
//        int ans = 0;
//        while( n > 0 ){
//            int rev = n % 10;
//            ans = ans * 10 + rev;
//            n = n/10;
//        }
//        System.out.println(ans);


        //12321 palindrome no.
//        int n = 1265321;
//        int rev = 0;
//        int dep = n;
//        while (n > 0){
//                int ld = n % 10;
//                rev = rev * 10 + ld ;
//                n = n /10;
//        }
//        if(  rev == dep ){
//            System.out.println("ispal");
//        }else {
//            System.out.println("not");
//        }


        //GCD leetcode 1979
//        int []nums = {7,5,6,8,3};
//        Arrays.sort(nums);
//        int min = nums[0];
//        int max = nums[nums.length-1];
//
//        while(min != 0){
//            int temp  = min;
//            min = max % min;
//            max = temp;
//        }
//        System.out.println( max);

        //Armstrong Number or not (sum of its own digits each raised to the power of the number of digits
        // and its self no. is equal);
//            int n = 153;
//            String str = String.valueOf(n);
//            int count = 0;
//        for (int i = 0; i < str.length(); i++) {
//            count++;
//        }
//            double sum = 0;
//            int temp = n;
//       while (n != 0){
//           int num = n % 10;
//           sum += Math.pow(num, count);
//           n = n/10;
//       }
//        System.out.println((int)sum);


        //Divisors of a Number
//        int n = 8;
//             ArrayList <Integer> list = new ArrayList<>();
//        for (int i = 1; i*i <= n; i++) {
//            int p = n % i ;
//            if(p== 0){
//                list.add(i);
//                if(n%i != n/i){
//                    list.add(n/i);
//
//                }
//            }
//        }
//        System.out.println(list);

        //prime or not
        int n = 19;
        int count = 0;
        for (int i = 1; i <= n ; i++) {
            if(n%i == 0){
                count++;
            }
        }
        if(count == 2 ){
            System.out.println("prime ");
        }else {
            System.out.println("not");
        }

    }
}
