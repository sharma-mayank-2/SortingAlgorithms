package com.app;

/**
 * Bubble Sort compare the adjacent elements of the array.
 * best case : when array is already sorted :  O(n)
 * worst case : when array is sorted in reverse order : O(n2)
 */
public class BubbleSort {
    public void bubbleSort(int[] a){
        for(int i = 0; i < a.length;i++){
            for(int j = 0; j < a.length-1;j++){
                if(a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }
}
