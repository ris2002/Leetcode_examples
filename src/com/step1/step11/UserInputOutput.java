package com.step1.step11;

/*
https://takeuforward.org/java/basic-input-and-output-in-java/

Input: 4
Output:
Value of x: 4

Process finished with exit code 0
 */

import java.util.Scanner;

public class UserInputOutput {

    public static void main(String[] args) {
        int x;
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
        System.out.println("Value of x: " + x);
        scanner.close();
    }
}
