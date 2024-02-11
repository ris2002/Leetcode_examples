package com.step3.step32;
import java.util.*;
public class countallsubarrayssum {
    public static int findAllSubarraysWithGivenSum(int arr[], int s) {
        // Write your code here.
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        int ctr=0;
        int n = arr.length; // Declare the variable 'n' and assign it the length of the array 'arr'
        for(int i=0;i<n;i++){
            sum += arr[i]; // Update the sum for each element in the array
            if(sum==s){ // Check if the current sum equals the given sum 's'
                ctr++; // If so, increment the counter
            }
            if(map.containsKey(sum - s)){
                ctr += map.get(sum - s); // Increment the counter by the value stored for (sum - s)
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1); // Update the map with the current sum
        }
        return ctr; // Return the total count of subarrays with the given sum
    }
}
