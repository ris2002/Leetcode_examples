package com.step2.step21;

public class quicksort {public static void quickSort(int[] input, int startIndex, int endIndex) {
    if (input == null || input.length == 0 || startIndex >= endIndex) {
        return;
    }
    int partition = partition(input, startIndex, endIndex);
    quickSort(input, startIndex, partition - 1);
    quickSort(input, partition + 1, endIndex);
}

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low + 1;/*
In the quicksort algorithm, the variable i is used to traverse the array from left to right, and it plays a role in finding the correct position for the pivot element. The low + 1 initialization for i in the partitioning process is a common convention to avoid comparing the pivot element with itself.

Let me explain with an example:

Consider an array [5, 3, 7, 1, 8] and let's say the pivot is the first element, which is 5. If we initialize i as low (the index of the pivot), then in the first iteration, when we check arr[i] <= pivot, it evaluates to true, and i is incremented. Now i points to the same element as the pivot.

In the subsequent steps, when comparing elements to the pivot, it could lead to unnecessary swaps and comparisons with the pivot element itself. By initializing i as low + 1, we skip the pivot element during the comparison phase, making the algorithm more efficient and avoiding unnecessary operations involving the pivot.*/
        int j = high;
        while (i <= j) {
            while (i <= high && arr[i] <= pivot) {
                i++;
            }
            while (j >= low && arr[j] > pivot) {
                j--;
            }
            if (i < j) {
                swap(arr, i, j);
            }
        }
        swap(arr, low, j);
        return j;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
//Check for looping conditions your is correct but avoid small errors