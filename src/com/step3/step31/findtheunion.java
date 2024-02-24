package com.step3.step31;
import java.util.*;
public class findtheunion { public static List<Integer> sortedArray(int[] a, int[] b) {
    int n = a.length;
    int m = b.length;
    ArrayList<Integer> c = new ArrayList<>();
    Set<Integer> set = new HashSet<>();//USED SET................................OR CAN USE MAP ALSO

    int i = 0;
    int j = 0;

    while (i < n && j < m) {
        if (a[i] < b[j]) {
            int x = a[i];
            if (set.add(x)) {//chks wheather the element is previously there or not

                c.add(x);
            }
            i++;
        } else if (a[i] > b[j]) {
            int x = b[j];
            if (set.add(x)) {
                c.add(x);
            }
            j++;
        } else {//if a[i]==b[j]
            int x = a[i];
            if (set.add(x)) {
                c.add(x);
            }
            i++;
            j++;
        }
    }

    while (i < n) {
        int x = a[i];
        if (set.add(x)) {
            c.add(x);
        }
        i++;
    }

    while (j < m) {
        int x = b[j];
        if (set.add(x)) {
            c.add(x);
        }
        j++;
    }

    return c;
}

    public static void main(String[] args) {
        int[] a = {1, 2, 2, 3, 5, 7};
        int[] b = {2, 2, 4, 6, 8};

        List<Integer> sortedResult = sortedArray(a, b);
        System.out.println(sortedResult);
    }
}
