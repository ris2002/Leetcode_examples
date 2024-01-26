package com.step2.step21;

public class Bubblesort {
    public static void bubbleSort(int[] arr, int n) {
        int x=n-1;

        //Your code goes here
        while(x>0){
            for(int i=0;i<x;i++){
                if(arr[i]>arr[i+1]){
                    swap(arr,i,i+1);
                }
            }
            x=x-1;
        }
    }
    public static void swap(int[]arr,int i,int j){
        int a=arr[i];
        arr[i]=arr[j];
        arr[j]=a;
    }
}
/*
* BUBBLE SORT BASICALLY WORKS ON THE PRINCIPLE THAT IT PUSHES THE MAX ELEMENT TO LAST AND ADJACENT SWAPPING.
 EX-[2,1,10,30,5]

 *
 *
 *
 *
 *
 *
 *
 *
 1st Iteration- This iteration starts from 0th index to last index.TAKE 2,1 SINCE 2>1 AND THEY ARE NOT IN SORTED ORDER IT SWAPS PLACES RESULTING IN [1,2,10,3,5].NOW TAKE 2 AND 10
 SINCE THEY ARE IN SORTED ORDER THERE WOULD BE NO CHANGE.Now since 30 and 5 are not in sorted order ,
 it changes the places resulting in [1,2,10,5,30].This is the first iteration.SO THE RESULT FROM 1ST ITERATION IS """""""[1,2,10,5,30]""""""""""
 2nd Iteration-This iteration  also starts from 0th index but ends at 2nd last index.chk if 1,2 ARE IN ASC ORDER YES ,2,10 YES,10,5 NO SO IT WOULD SWAP THE PLACES OF 10 AND 5
 * RESULTING IN [1,2,5,10,30].NOW CHK THE IF 10,30 IN ASC ORDER YES.
 *
 * Even though we got the answer the iteration doesent end there in 3rd iteration we chk if the array is in correct order from 0th index to 2nd lst index


 Therefore a pattern emerges-
 * t=step1 the array iteraes from 0 to n-1
 * then from 0 to n-2
 * then from 0 to n-3
 * then from 0 to n-4
 * sooo on from 0 to 1
 *
 *
 *
 *
 *
 *
 *
*/