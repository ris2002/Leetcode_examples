package com.step1.step15;

public class sumofFirstn {
    public static long sum(long n){
        long ori_N=n;
        return helpFunc(ori_N,0,0);
    }

    private static long helpFunc(long ori_N, long i, long z) {
        if(i<ori_N){
            long h=ori_N - i;
            z=z+h;
            i=i+i;
            return helpFunc(ori_N,i,z);
        }
        return z;
    }
}
/* This above code uses the recursion concept.When ever a method is called in java , a new frame is added to stack to keep track of local variables.
Here in recursion, each recursive call adds a new frame in stack.stack has limited memoryand if the the input is to large suppose n=10000 in
 above problem it reports stack overflow. This is the reason the above problem is NOT OPTIMUM SOLUTION  it is passing only 49/50 testcases.But inorder to understand recursion concept I
  have written the problem
&&&&&&&&&&&

The optimum solution is using the formula n(n+1)/2 to find the dum of first n numbers.
*
* */