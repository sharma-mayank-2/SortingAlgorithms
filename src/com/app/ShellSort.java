package com.app;

/**
 * Created by s.mayank on 21/10/16.
 * Shell Sort work on gap bases that is increment, which is initially set to a.length/2.
 * if increment become 1 then algo works as insertion sort.
 * best case : when array is already sorted :  O(n)
 * worst case : when array is sorted in reverse order : O(n)(logn2)
 */
public class ShellSort {
    public void shellSort(int[] a){
        int j;
        for(int inc = a.length/2 ; inc > 0 ; inc = inc/2){
            for(int i = inc; i < a.length; i++){
                int temp = a[i];
                for(j = i; j >= inc; j = j-inc){
                    if(temp < a[j-inc]){
                        a[j] = a[j-inc];
                    }else{
                        break;
                    }
                }
                a[j] = temp;
            }
        }
    }
}
