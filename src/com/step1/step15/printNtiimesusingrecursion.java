package com.step1.step15;
import java.util.ArrayList;
import java.util.List;
public class printNtiimesusingrecursion {{
    public static List<String> printNtimes(int n){
        // Write your code here.
        List<String>l1=new ArrayList<>();
        realfunc( n,l1);
        return l1;
    }
    public static void realfunc(int n,List<String>l1){
        if(n>0){
            l1.add(0,"Coding Ninjas");

            realfunc( n-1,l1);
        }
    }
}
