package com.step2.step21;

public class mergesort {

    public static void mergeSort(int[] arr, int l, int r){
        // Write your code here

        int mid=(l+r)/2;
        if(l>=r){
            return;
        }
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        merge(arr,l,mid,r);

    }
    public static void merge(int[]arr,int l,int mid,int r){

        int temp []=new int [r-l+1];
        int left=l;
        int right=mid+1;
        int index=0;//this must be given to ensure the proper indexing of the temp array.
        while(left<=mid && right<=r){
            if(arr[left]<arr[right]){
                temp[index]=arr[left];
                left++;
                index++;
            }
            else{
                temp[index]=arr[right];
                right++;
                index++;
            }
        }
        while(left<=mid){
            temp[index]=arr[left];
            left++;
            index++;}
        while(right<=r){temp[index]=arr[right];
            right++;
            index++;}

        for(int i=l;i <= r;i++){
            arr[i]=temp[i-l];
        }
    }

}
