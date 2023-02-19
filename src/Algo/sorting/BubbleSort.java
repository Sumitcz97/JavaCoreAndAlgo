package Algo.sorting;

import java.util.Arrays;

public class BubbleSort {

    //it will sort each time biggest element at last
    public static void main(String[] args) {

        int[] arr = {10,4, 1, 3, 9, 7, 2};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            System.out.println(Arrays.toString(arr));
        }

        System.out.println("Final Sorted Array:"+Arrays.toString(arr));
    }
}