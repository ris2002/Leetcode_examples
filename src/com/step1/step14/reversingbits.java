package com.step1.step14;
import java.util.ArrayList;

import java.util.*;
public class reversingbits {
    long n=12;
    public static long reverseBits(long n) {

        long y=0;
        //List<Integer>l1=new ArrayList<Integer>();
        List<Long> l1 = new ArrayList<Long>();
        List < Long > l2 = new ArrayList <> ();


        long b=Integer.MAX_VALUE;
        while(n!=0){//here conversion of integer to bits takes place
            b=n%2;
            l1.add(b);
            n=n/2;
            /* if we take 12 as an example ,step1- b=12%2 that implies b=0 "using % we get the remainder" and add 0 to list l1
            step2-b=6%2,b==0 and add 0 to list l1
            step3-b=3%2,b==1 add 1 to l1
            step4-b=1%2 ,b==1 add 1 to l1

            this process ends here. what is being noticed here is if we print l1 we get 0011 which is opposite of correct binary equivalent of 12 i.e 1100.

             */
        }


        long size = l1.size ();
        long u=32-(int)size;
        while(u!=0){
            l2.add(0L);
            u=u-1;
            /* now take another list l2 using this what should be done is we add 0'S OF SIZE= 32- the size of l1 list to get a total of 32 binary bits*/
        }
        for (long i = size-1 ; i >= 0; i--)
        {
            long r = l1.get ((int) i);
            l2.add (r);
            /*It is important to remember that an arraylist is FIFO(FIRST IN FIRST OUT), i.e we add elements to the end of the list and remove the first element
            // long r = l1.get ((int) i); is used to get the element from l1 and we add this elemnt to l2 so that the resulting ans is -[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0] in correcrt format.
            * */


        }
        long x=0;
        long h=31;
        while(h>=0){

            long p=(long)Math.pow(2, h);
            x = x + l2.get((int) (h)) * p;
            h=h-1;
            /*
            in this while loop we x=0 and h=31.h=31 means the l2 would start back wards essentially reversing it.long p=(long)Math.pow(2, h); is part of the formula of converting binary to decimals.



             */

        }
        return x;


    }
}
