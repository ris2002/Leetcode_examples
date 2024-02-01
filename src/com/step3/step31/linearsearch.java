package com.step3.step31;

public class linearsearch {

        public static int linearSearch(int n, int num, int []arr){
        // Write your code here.
        int []a=new int [1];
        a[0]=-1;
        for(int i=0;i<n;i++){
            if(arr[i]==num){
                a[0]= i;
                break;
            }



        }
        return a[0];

    }
}
