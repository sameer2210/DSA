package Interview.Array;

import java.util.*;

public class Reverse{
  public static void main(String args[]) {

    int arr[] = { 2, 3, 4, 6, 7, 8 };

    int i = 0;
    int j = arr.length - 1;

    while (i < j) {
      arr[i] = arr[j];
      i++;
      j--;
    }

    System.out.println(Arrays.toString(arr));
  }
}