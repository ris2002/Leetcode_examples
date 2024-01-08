package com.step1.step14;

public class countDigits {
    public static int countDigits(int n){
        int i=0;
        while(n>0){
            n=n/10;
            i++;
        }
        return i;
        // Write your code here.
    }
}
