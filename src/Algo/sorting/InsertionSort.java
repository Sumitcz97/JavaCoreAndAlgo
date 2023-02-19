package Algo.sorting;

import java.util.Arrays;

public class InsertionSort {
    public  static void main(String[] args) {


        //This algorithm will traverse and make the array element sorted
        /*
[1, 4, 3, 9, 7, 2]
[1, 3, 4, 9, 7, 2]
[1, 3, 4, 9, 7, 2]
[1, 3, 4, 7, 9, 2]
[1, 2, 3, 4, 7, 9]
Final Sorted Array:[1, 2, 3, 4, 7, 9]
         */
        int[] arr = {4, 1, 3, 9, 7, 2};

        for(int i=1;i<arr.length;i++){
            int j=i-1;
            int key=arr[i];
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
            System.out.println(Arrays.toString(arr));
        }
        System.out.println("Final Sorted Array:"+Arrays.toString(arr));

    }
}
