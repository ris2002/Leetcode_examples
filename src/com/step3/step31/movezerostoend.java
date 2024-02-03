package com.step3.step31;

public class movezerostoend {
    public static int[] moveZeros(int n, int []a) {
        // Write your code here.
        int []a2=new int [n];
        int j=0;
        for(int i=0;i<n;i++){
            int b=a[i];
            if(b!=0){
                a2[j]=a[i];
                j++;
            }


        }

        int k=n-(j+1);
        for(int i=0;i<k;i++){
            j++;
            a2[j]=0;
        }
        return a2;
    }
}
