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

        dvDent = dvSor; //This line 'dvDent = dvSor' comes before ' dvSor = reMd' because dvDent = dvSor,
                       // the dividend first takes the value of original divisor then we can assign the remainder value to divisor
                      //      or else we end up adding remainder value to dividend
        dvSor = reMd;
        reMd = dvDent % dvSor;
        //hcf=dvSor;
    }

    return dvSor;
}
}
/*    The logic followed here is the shortcut method used to find the HCF
 imagine 2 numbers a and b where a>b, a becomes the divident and b becomes the divisior
 &  we divide    "a/b" if  s !=0    where s=s=a%b, b becomes the dividend and s becomes the divisor and the hcf of a, b is the divisior which obtaians 0
Steps to find the HCF of any given set of numbers.

Step 1: Divide the larger number by the smaller number first, such as;
Larger Number/Smaller Number

Step 2: Divide the divisor of step 1 by the remainder left.
Divisor of step 1/Remainder

Step 3: Again divide the divisor of step 2 by the remainder.
Divisor of step 2/Remainder

Step 4: Repeat the process until the remainder is zero.
Step 5: The divisor of the last step is the HCF.







 */