package d7;

import java.util.Arrays;


public class ProductDetails {
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 5, 7, 4, 5, 6, 7, 8};
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]) {
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            } else i++;
        }
        System.out.println(Arrays.toString(arr));

    }
}
