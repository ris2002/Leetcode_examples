package com.step3.step32;

import java.util.ArrayList;
import java.util.List;


public class superiorelement {public static List<Integer> superiorElements(int[] a) {
    int n = a.length;
    int L = Integer.MIN_VALUE;
    ArrayList<Integer> list = new ArrayList<>();

    for (int i = n-1; i>=0; i--) {
        if(a[i]>L){
            list.add(a[i]);
        }
        L=Math.max(L,a[i]);

    }
    return list;
}

}
