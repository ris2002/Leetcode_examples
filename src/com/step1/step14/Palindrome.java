package com.step1.step14;


import java.util.ArrayList;
import java.util.List;

public class Palindrome {


    public static void main(String[] args) {
        //You can modify code by giving different input number
        //always class name should start with CAPITAL letter, rename classes in git repo
        //try to run the file and setup if java program is running or not
        int n = 12345;
        int originalN = n;

        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();

        while (n > 0) {
            int digit = n % 10;
            l1.add(0, digit);
            n = n / 10;
        }

        int size = l1.size();

        for (int i = size - 1; i >= 0; i--) {
            int e = l1.get(i);
            l2.add(e);
        }

        int reversedNumber = 0;
        for (int j = 0; j < size; j++) {
            reversedNumber = l2.get(j) * (int) Math.pow(10, size - 1 - j) + reversedNumber;
        }

        //return
        originalN = reversedNumber;
        System.out.println("originalN: " + originalN);

    }


}