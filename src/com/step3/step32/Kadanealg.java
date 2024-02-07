package com.step3.step32;

public class Kadanealg {public static long maxSubarraySum(int[] arr, int n) {

    long sum = 0;

    long maxi = Integer.MIN_VALUE;

    for(int i=0;i<n;i++){

        sum+=arr[i];

        if(sum<0){

            sum = 0;

        }

        maxi = Math.max(maxi, sum);

    }

    return maxi;

}
}
