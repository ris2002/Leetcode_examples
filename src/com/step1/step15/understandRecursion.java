package com.step1.step15;

public class understandRecursion {
    public static int[] printNos(int x) {
        // Write Your Code Here
        int[] newarr=new int[x];
        printHelp(1,x,newarr,0);
        return newarr;
    }
    public static void printHelp(int i,int x,int[]newarr,int index){
        if(i<=x){
            newarr[index]=i;
            printHelp(i+1, x, newarr, index+1);
        }
    }
}






/*SO BASICALLY THE RECURSION IS HAPPENNING IN 'printHelp(int i,int x,int[]newarr,int index)' FUNCTION  */