package pattern;

import java.util.Arrays;

public class Que {
    public static void main(String[] args) {

        //4*4 pattern;
//        int n = 4;
//        for(int i = 0; i  <= n ; i++ ){
//            for(int j = 0; j < n; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //90 dig triangle
//        int n = 5 ;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j <= i ; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //90dig number triangle
//        int n = 5;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j <= i; j++) {
//                System.out.print(j+1);
//            }
//            System.out.println();
//        }


        //number triangle repeat
//        int n = 5;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j <= i; j++) {
//                System.out.print(i+1);
//            }
//            System.out.println();
//        }

        //number triangle
//        int n = 5;
//        for (int i = 0; i <= n; i++) {
//            for (int j = 1; j <= n-i; j++) {
//                System.out.print(j);
//            }
//            System.out.println();
//        }


        // triangle
//        int n = 5;
//
//        for (int i = 0; i <= n-1; i++) {
//            for (int j = 1; j <= n-i-1; j++) {
//                System.out.print(" ");
//            }
//
//            for (int j = 1; j <= 2*i+1; j++) {
//                System.out.print("*");
//            }
//
//            for (int k = 1; k <= n-i-1; k++) {
//                System.out.print(" ");
//            }
//            System.out.println();
//        }


       // reverse triangle
//            int n = 7;
//        for (int i = 0; i <= n-i ; i++) {
//            for (int j = 0; j <= i-1; j++) {
//                System.out.print(" ");
//            }
//            for (int k = 0; k <= n-2*i-1 ; k++) {
//                System.out.print("*");
//            }
//            for (int l = 0; l <= i-1 ; l++) {
//                System.out.print(" ");
//            }
//            System.out.println();
//        }


        //rhombus
//        int n = 7;
//        for (int i = 1; i <= n ; i++) {
//
//            for (int j = 1; j <= n-i; j++) {
//                System.out.print("-");
//            }
//            for (int j = 1; j <=2*i-1 ; j++) {
//                System.out.print("*");
//            }
//            for (int j = 1; j <= n-i; j++) {
//                System.out.print("-");
//            }
//            System.out.println();
//        }
//        for (int i = n-1; i >= 0; i--) {
//            for (int j = 1; j <= n-i; j++) {
//                System.out.print("-");
//            }
//            for (int j = 1; j <= 2*i-1 ; j++) {
//                System.out.print("*");
//            }
//            for (int j = 1; j <=n-i ; j++) {
//                System.out.print("-");
//            }
//            System.out.println();
//        }



        //right triagle
//        int n = 7;
//        for (int i = 1; i <= n ; i++) {
//            for (int j = 1; j <= i ; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for (int i = 1; i <= n ; i++) {
//            for (int j = n-1; j >= i ; j--) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }


//        01 triagle
//        int n = 5;
//        for (int i = 0; i <= n ; i++) {
//            for (int j = 0; j <= i ; j++) {
//                if((i+j) % 2 == 0) {
//                    System.out.print("1");
//                }else {
//                    System.out.print("0");
//                }
//            }
//            System.out.println();
//        }


        //U triangle
//        int n = 4;
//        for (int i = 1; i <= n ; i++) {
//            for (int j = 1; j <= i ; j++) {
//                System.out.print(j);
//            }
//            int space = 2*(n - i);
//             for (int j = 1; j <= space; j++) {
//                System.out.print(" ");
//            }
//            for (int j = i; j >= 1 ; j--) {
//                System.out.print(j);
//            }
//            System.out.println();
//        }

        //aba triangel
//        int n = 5;
//        for (int i = 1; i <= n ; i++) {
//            for (int j = n; j >= i ; j--) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= i ; j++) {
//            char ch = (char)('a'+j-1);
//                System.out.print(ch);
//                System.out.print(j);
//            }
//            for (int j = i-1; j >= 1; j--) {
//                char ch = (char)('a'+j-1);
//                System.out.print(ch);
//                System.out.print(j);
//            }
//            System.out.println();
//        }


        //reverse abc triangle
//        int n = 5;
//        for (int i = 1; i <= n ; i++) {
//            char ch = (char)('A' + (n-i));
//            for (int j = 1; j <= i ; j++) {
//                System.out.print(ch + " ");
//                ch++;
//            }
//            System.out.println();
//        }


        //hole rhombus
//        int n = 7;
//        for (int i = 1; i <= n ; i++) {
//            for (int j = n; j >= i; j--) {
//                System.out.print("*");
//            }
//            for (int j = 1; j <= 2*i-2; j++) {
//                System.out.print(" ");
//            }
//            for (int j = n; j >= i; j--) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for (int i = 2; i <= n ; i++) {
//            for (int j = 1; j <=i ; j++) {
//                System.out.print("*");
//            }
//            for (int j = 1; j <= 2 * (n - i); j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }



        //H shape
//         int n= 5;
//         int size = 2*n-1;
//
//        for (int i = 1; i <= size ; i++) {
//                int row = (i <= n)? i : 2*n-i;
//            for (int j = 1; j <= size ; j++) {
//                if(j <= row || j > size-row ){
//                    System.out.print("*");
//                }else{
//                    System.out.print(" ");
//                }
//            }
//                System.out.println();
//        }


        //border
//        int n = 4;
//        int size = 2*n-1;
//
//        for (int i = 1; i <= size; i++) {
//            for (int j = 1; j <= size; j++) {
//                if(j == 1 || i == 1 || i == size || j == size ){
//                    if(i % 2 == 0){
//                        System.out.print(" ");
//                    }else {
//                        System.out.print("*");
//                    }
//                }else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

        //border-border
        int n = 4;
        int size = 2*n-1;

        for (int i = 1; i <=size ; i++) {
            for (int j = 1; j <=size ; j++) {
                int top = i-1;
                int bottom = size-i;
                int left = j-1;
                int right = size-j;

                int minNo = Math.min(Math.min(top,bottom), Math.min(left,right));

                System.out.print((n-minNo) + " ");
            }
            System.out.println();
        }

    }
}