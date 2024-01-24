package com.step1.step16;
import java.util.Arrays;
public class hashingTheory {{
    public static int[] countFrequency(int n, int x, int []nums){

        int hashnums[]=new int[n];
        Arrays.fill(hashnums,0);//method to directly fill 0's in an array without looping

        for (int i=0;i<n;i++){
            int a=nums[i];
            hashh(a,hashnums);
        }

        return hashnums;
    }
    public static void hashh(int value,int []hashnums) {
        // Check if the value is within the valid range
        if (value >0 && value < hashnums.length) {
            hashnums[value-1] = hashnums[value-1] + 1;
        }
    }

}
}
/*PASSING 38 OUT OF 50 TESTCASES
* BASICALLY I CREATED ||LY AN EMPTY ARRAY OF SIZE N WITH ZEROS.WHAT HASHING IS IS IT PRE-STORES THE VALUES AND FETCHS WHEN REQURIRED.
* SINCE I WANT TO FIND THE FREQUENCY OF THE ELEMENTS IN AN ARRAY,INSTEAD OF WRITING A FOR LOOP WITH A COUNTER I HAVE WRITTEN
* A LOOP WHERE WHEN I RETRIVE AN ELEMENT FROM NUMS[] ARRAY,I increment  THE VALUE by +1 IN HASHNUMS     ,WHICH WAS INITIALLY 0.
* THIS IS HOW I AM ABLE TO KEEP TALLY OF THE  FREQUENCIES OFELEME NTS
*
*
*
*
*
* */