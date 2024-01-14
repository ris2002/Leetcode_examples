package com.step1.step14;

public class GCD {public static int calcGCD(int n, int m){
    // Write your code here.
    int dvSor;
    int dvDent;
    int hcf = Integer.MIN_VALUE;

    if (n > m)
    {
        dvSor = m;
        dvDent = n;

    }
    else
    {
        dvSor = n;
        dvDent = m;
    }
    int reMd = dvDent % dvSor;

    while (reMd != 0)
    {

        dvDent = dvSor;
        dvSor = reMd;
        reMd = dvDent % dvSor;
        //hcf=dvSor;
    }

    return dvSor;
}
}
