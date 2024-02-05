package com.step3.step32;
import java.util.*;
public class TwoSumProblem {
    public static String read(int n, int[] book, int target) {
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int num = book[i];  // Fix: Use 'book' array instead of 'arr'
            int moreNeeded = target - num;
            if (mpp.containsKey(moreNeeded)) {
                return "YES";
            }

            mpp.put(book[i], i);
        }
        return "NO";
    }
}
