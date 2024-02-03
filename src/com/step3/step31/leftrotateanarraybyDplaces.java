package com.step3.step31;
import java.util.ArrayList;
public class leftrotateanarraybyDplaces {
    public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
        // Write your code here.
        ArrayList<Integer>arr2=new ArrayList<>();
        int size=arr.size();

        if(k==size){
            return arr;
        }
        if(k>size){
            k=k%size;
        }

        for(int i=k;i<size;i++){
            int a=arr.get(i);
            arr2.add(a);
        }
        for(int i=0;i<k;i++){
            int a=arr.get(i);
            arr2.add(a);
        }
        return arr2;

    }
    /*WHAT THIS ALG DOES IS */


}
/*OR */