package com.step1.step15;
/*Problem statement
Given an array 'arr' of size 'n'.



Return an array with all the elements placed in reverse order.



Note:
You don’t need to print anything. Just implement the given function.
Example:
Input: n = 6, arr = [5, 7, 8, 1, 6, 3]

Output: [3, 6, 1, 8, 7, 5]

Explanation: After reversing the array, it looks like this [3, 6, 1, 8, 7, 5].*/
public class reverseArray {

    public static int[] reverseArray(int n, int []nums) {
        // Write your code here.
        int rev[]=new int[n];
        int x=n-1;
        return help(n,x,nums,0,rev);


    }
    public static int[] help(int n,int x,int []nums,int i,int []rev){

        if (i<n){
            rev[i]=nums[x];
            help(n,x-1,nums,i+1,rev);
        }
        return rev;




    }
}
