package com.app;

/**
 * Created by s.mayank on 21/10/16.
 * Selection Sort will find the Minimum in the array and replace with the a[0]
 * best case : when array is already sorted :  O(n2)
 * worst case : when array is sorted in reverse order : O(n2)
 */
public class SelectionSort {
    public void selectionSort(int[] a){
        int j;
        for(int i = 0; i < a.length-1; i++){
            int temp = a[i];
            int index = i;
            int x = temp;
            for(j = i; j < a.length; j++){
                if(x > a[j]){
                    x = a[j];
                    index = j;
                }
            }
            int small = a[index];
            a[index] = temp;
            a[i] = small;
        }
    }
}
