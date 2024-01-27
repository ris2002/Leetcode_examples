package com.step2.step21;

public class Bubblesortreccursion {public static void bubbleSort(int[] arr, int n) {
    bs(arr, n);
}

    public static void bs(int[] arr, int x) {
        if (x != 0) {
            for (int i = 0; i < x - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                }
            }
            bs(arr, x - 1);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}
