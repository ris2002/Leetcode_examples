package com.step3.step32;
import java.util.* ;
import java.io.*;
public class sortingoneszerosandtwo {

    //SORTING METHODS ARE ASLO APPLICABLE BUT HAS MORE TIMECOMPLEXITY
    public static void sortArray(ArrayList<Integer> arr, int n) {
        // Write your code here.

        HashMap<Integer,Integer>map=new HashMap<>();
        for(int nums: arr){
            map.put(nums,map.getOrDefault(nums, 0)+1);//IMPORTING ALL VALUES TO THE ARRAY
        }
        arr.clear();




        int zero = map.getOrDefault(0, 0);//getOrDefault retrives the value from map assigned to
        int one = map.getOrDefault(1, 0);//that key  if the key is not present it assigns default value that in this case is 0.
        int two = map.getOrDefault(2, 0);


        for(int i=0;i<zero;i++){
            arr.add(0);
        }
        for(int i=0;i<one;i++){
            arr.add(1);
        }
        for(int i=0;i<two;i++){
            arr.add(2);
        }



    }
}
