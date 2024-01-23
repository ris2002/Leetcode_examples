package com.step1.step15;

public class FIBONACCI {public static int[] generateFibonacciNumbers(int n) {
    // Write your code here.
    int[] nums = new int[n];
    nums[0] = 0;

    if (n > 1) {
        nums[1] = 1;
        fibo(nums, n, 2);
    }
    return fibo(nums, n, 2);

}
    public static int[]fibo(int [] nums,int n,int i){

        if(i<n){
            int x=nums[i-2]+nums[i-1];
            nums[i]=x;
            fibo(nums,n,i+1);
        }
        return nums;
    }
}
