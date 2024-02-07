package com.step3.step32;

public class alternateNums {public static int[] alternateNumbers(int []a) {
    int n = a.length;
    int[] x = new int[n];
    int j = 0;
    int k = 1;
    for (int i = 0; i < n; i++) {
        if (a[i] > 0 && j < n) {
            x[j] = a[i];
            j += 2;
        } else if (a[i] < 0 && k < n) {
            x[k] = a[i];
            k += 2;
        }
    }
    return x;
}
}
