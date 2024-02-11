package com.step3.step32;
import java.util.*;
public class longestsuccessiveElements {
    public static int longestSuccessiveElements(int[] a) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int ctr = 0;
        for (int num : a) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int i = 0; i < a.length; i++) {
            int current = a[i];
            int consecutiveCount = 0;
            while (map.containsKey(current)) {
                consecutiveCount++;
                current++;
            }
            ctr = Math.max(ctr, consecutiveCount);
        }
        return ctr;
    }
}
