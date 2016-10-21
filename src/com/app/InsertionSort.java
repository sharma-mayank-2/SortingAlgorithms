package com.app;

/**
 * Created by s.mayank on 21/10/16.
 * It traverse back till the first to compare the elements.
 * best case : when array is already sorted :  O(n)
 * worst case : when array is sorted in reverse order : O(n2)
 */
public class InsertionSort {
    public void insertionSort(int[] a){
        for(int i = 1; i < a.length; i++){
            for(int j = i; j > 0 ;j--){
                if(a[j-1] > a[j]){
                    int temp = a[j-1];
                    a[j-1] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
}
