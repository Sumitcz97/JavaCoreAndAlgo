package Algo.sorting;

import java.util.Arrays;

public class SelectionSort {
      // Traverse all index find the minimum number index and swap it on front
    public  static void main(String[] args) {

        int[] arr = {4, 1, 3, 9, 7,2};

        //Min element index
        int minIndexOfArray;
        for (int i = 0; i < arr.length; i++) {
            //comparing from 0th place then increment
            minIndexOfArray=i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[minIndexOfArray]) {
                    minIndexOfArray = j;
                }
            }

            //swapping min index to currently executing index i.e i
            int temp = arr[minIndexOfArray];
            arr[minIndexOfArray] = arr[i];
            arr[i] = temp;
            System.out.println(Arrays.toString(arr));
        }
        System.out.println("Final Sorted Array:"+Arrays.toString(arr));

    }
}
