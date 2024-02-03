package com.step3.step31;

public class rotateleftarrayby1place {
    static int[] rotateArray(int[] arr, int n) {
        // Write your code here.
        int [] arr2=new int[n];
        for(int i=1;i<n;i++){
            int a=arr[i];
            arr2[i-1]=a;
        }

        arr2[n-1]=arr[0];
        return arr2;
    }
}
/*OR
* import java.util.* ;
import java.io.*;


public class Solution {

    static int[] rotateArray(int[] arr, int n) {
        // Write your code here.
        int x=n-2;
        return ra(arr,x,0);

    }
    static int[] ra(int[] arr, int x,int i) {
        if(x>=i){
            swap(arr,i,i+1);
        ra(arr,x,i+1);
        }
        return arr;


}

public static void swap(int[]arr,int i,int j){
    int a=arr[j];
    arr[j]=arr[i];
    arr[i]=a;
}

}*/