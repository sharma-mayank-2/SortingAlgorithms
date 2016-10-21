package com.app;

/**
 * Created by s.mayank on 21/10/16.
 */
public class Lessson1 {
    static int[] a = {2,8,0,-10,5,-20};
    public static void main(String[] args){
        System.out.println("calling bubble sort");
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.bubbleSort(a);
        for(int x : a){
            System.out.print(x+" ");
        }
        System.out.println();

        System.out.println("calling insertion sort");
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.insertionSort(a);
        for(int x : a){
            System.out.print(x+" ");
        }
        System.out.println();

        System.out.println("calling selection sort");
        SelectionSort selecttionSort = new SelectionSort();
        selecttionSort.selectionSort(a);
        for(int x : a){
            System.out.print(x+" ");
        }
        System.out.println();

        System.out.println("calling shell sort");
        ShellSort shellSort = new ShellSort();
        shellSort.shellSort(a);
        for(int x : a){
            System.out.print(x+" ");
        }
    }
}
