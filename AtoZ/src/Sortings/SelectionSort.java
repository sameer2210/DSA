package Sortings;
import java.util.*;

public class SelectionSort {

    public static void main (String []args) {
        int[] arr = {2, 4, 7, 9, 4, 6, 1};

        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int minvalue = i;
            for (int j = i+1; j < n; j++) {
                if(arr[j] < arr[minvalue]){
                    minvalue = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minvalue];
            arr[minvalue] = temp;
        }

        for(int num: arr){
            System.out.println(num + " ");
        }

    }
}



