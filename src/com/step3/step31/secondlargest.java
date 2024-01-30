package com.step3.step31;

public class secondlargest {public static int[] getSecondOrderElements(int n, int []a) {
    // Write your code here.
    int low=0;
    int high=n-1;
    int []sec=new int[2];
    qs(a,low,high);
    sec[0]=a[n-2];
    sec[1]=a[1];
    return sec;

}
    public static void qs(int []arr,int low,int high){
        if(low<high){
            int partition=func(arr,low,high);
            qs(arr,low,partition-1);
            qs(arr,partition+1,high);
        }


    }
    public static int  func(int[]arr,int low,int high){
        int pivot=arr[low];
        int i=low+1;
        int j=high;
        while(i<=j){
            while(i<=j&&arr[i]<=pivot){
                i++;
            }
            while(i<=j&& arr[j]>pivot){
                j--;
            }


            if(i<=j)
            {swap(arr,i,j);}

        }
        swap(arr,low,j);
        return j;
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
