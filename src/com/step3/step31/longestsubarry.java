package com.step3.step31;
import java.util.HashMap;
public class longestsubarry {
    public static int getLongestSubarray(int[] nums, int k) {
        // Write your code here.
        return longestSubarrayWithSumK(nums, k);
    }

    public static int longestSubarrayWithSumK(int[] a, int k) {
        int sum = 0;
        int ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < a.length; i++) {
            sum += a[i];
            if (sum == k)
                ans = Math.max(ans, i + 1);
            if (map.containsKey(sum - k)) {
                ans = Math.max(ans, i - map.get(sum - k));
            }
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }

        return ans;
    }
}
