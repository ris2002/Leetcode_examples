package com.step2.step21;

public class selctionSort {
    public static void selectionSort(int[] arr) {
        //Your code goes here
        int  n=arr.length;
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i;j<n;j++){
                if(arr[j]<arr[min]){

                    min = j;//the purpose of an inner loop is to find the min index and after finding the min index
                    // we swap the min element(jth index)wit ith index
                }

            }
            swap(arr,i,min);//swap func should be outside this loop to ensure that swapping happens only once

        }

    }
    public static void swap(int []arr,int min,int j){
        int a=arr[min];
        arr[min]=arr[j];
        arr[j]=a;
    }
}


/*Selection sort is nothing but selecting and swapping.What it does is it finds the min element from the
 unsorted part of array and inserts it at the beginning
 for example if we take array arr=[13,46,24,52,20,9]
 step1-at the beginning the whole array is unsorted,it checks what is the min element here so min =9,it swaps with the beginning element
  of array that is 13
  so Sub-Result-9,46,24,52,20,13
  step2-now since 9 is sorted it is untouched.now the next min element is 13 ant it will be put at the beginning.
  Sub-Result=[9,13,24,52,20,46]
  similarly
  step3-[9,13,20,52,24,46]
  step4-[9,13,20,24,52,46]
  step5-[9,13,20,24,46,52]=sorted array..........................
  WHAT WE HAVE OBSERVED IN THIS SCENARIO IS
  STEP1-SWAP INDEX 0 WITH MIN_INDEX FROM RANGE[0 to n-1]
  STEP2-SWAP INDEX 1 WITH MIN_INDEX FROM RANGE[1 to n-1]
   STEP3-SWAP INDEX 2 WITH MIN_INDEX FROM RANGE[2 to n-1]
   .
   .
   .
   .
   .
   .
   .
   .
    STEP-SWAP INDEX n-2 WITH MIN_INDEX FROM RANGE[n-2 to n-1]





*/