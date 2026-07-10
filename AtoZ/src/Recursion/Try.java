package Recursion;
import java.util.*;
public class Try {

    //Factorial
//    static int fact (int n){
//        if(n == 0){
//            return 1;
//        }
//           return n *= fact(n-1);
//    }
//    public static void main(String []args){
//            int n = 5;
//            int ans = fact(n);
//        System.out.println(ans);
//}


    //reverse an Array------------------------------------------------------------------------
//    static void  rev (int []arr, int start, int end){
//        if(start >= end ){
//            return;
//        }
//        int temp = arr[start];
//        arr[start] = arr[end];
//        arr[end] = temp;
//        rev(arr, start+1, end-1);
//    }
//    public static void main(String []args) {
//            int []arr = {5,4,3,2,1};
//          rev(arr, 0, arr.length-1);
//        System.out.println(Arrays.toString(arr));
//    }

        //letcode 125 palandrome----------------------------------------------------------
//        static boolean isPalindrome(String str, int start , int end) {
//            if(start >= end ){
//                return true;
//            }
//            if(str.charAt(start) != str.charAt(end)){
//                return false;
//            }
//            return isPalindrome(str, start+1, end-1);
//
//        };
//        public static void main (String []args){
//            String s = "race a car";
//            String str = s.toLowerCase().replaceAll("[^a-zA-Z]","");
//
//            boolean ans =  isPalindrome(str,0,str.length()-1);
//            System.out.println(ans);
//        }



        //fibonacci number of n  list ( lc - 509)-------------------------------------------------
   static int fibo(int n){
       if(n == 0){
           return 0;
       }
       if(n == 1) return 1;
       return fibo(n-1)+ fibo(n-2);
    }
    public static void main (String []args){
       int n = 10;

        for (int i = 0; i <= n-1 ; i++) {
        System.out.println(fibo(i) + " ");
        }
    }


}