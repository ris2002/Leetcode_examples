package com.step3.step33;
import java.util.*;
public class majorityelememt {public static List<Integer> majorityElement(int[] v) {
    ArrayList<Integer> arr = new ArrayList<>();

    int cnt1 = 0;
    int cnt2 = 0;
    int ele1 = 0;
    int ele2 = -1;

    for (int i = 0; i < v.length; i++) {
        if (cnt1 == 0 && v[i] != ele2) {
            ele1 = v[i];
            cnt1++;
        } else if (cnt2 == 0 && v[i] != ele1) {
            ele2 = v[i];
            cnt2++;
        } else if (ele1 == v[i]) {
            cnt1++;
        } else if (ele2 == v[i]) {
            cnt2++;
        } else {
            cnt1--;
            cnt2--;
        }
    }

    // Count occurrences of ele1 and ele2 to verify if they are actually majority elements
    cnt1 = 0;
    cnt2 = 0;
    for (int i = 0; i < v.length; i++) {
        if (v[i] == ele1) {
            cnt1++;
        } else if (v[i] == ele2) {
            cnt2++;
        }
    }

    if (cnt1 > v.length / 3) {
        arr.add(ele1);
    }
    if (cnt2 > v.length / 3) {
        arr.add(ele2);
    }

    return arr;
}
}
