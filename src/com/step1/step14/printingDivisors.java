package com.step1.step14;

public class printingDivisors {{
    public static List<Integer> printDivisors(int n) {
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        int z = (int) Math.sqrt(n);//here the confusion part ,this statement is written so
        // that it can limit the amt of no. that we are hoing diviide with in the for loop
        //or ............In the provided code, the line int z = (int) Math.sqrt(n); is calculating the square root of the input number n and storing it in the variable z. The purpose of this calculation is to determine a limit for the loop that follows.
        //
        //The loop iterates from i = 1 to i <= z, where z is the square root of n. This is based on the property that if n has a divisor d such that 1 < d < sqrt(n), then there must be another divisor n/d where d < n/d < sqrt(n).
        //
        //By only iterating up to the square root of n, the code ensures that it considers all possible divisors of n without redundant iterations. This optimization is useful for efficiency, especially when dealing with large numbers, as it reduces the number of iterations required to find all divisors.
        //
        //Here's a breakdown of the logic:
        //
        //The loop iterates from i = 1 to i <= sqrt(n).
        //For each i, it checks if n is divisible by i (i.e., n % i == 0).
        //If divisible, it adds both i and n/i to the list of divisors (l2). The condition if (x != i) ensures that if i and n/i are equal, it doesn't add the same divisor twice.
        //Finally, the list l2 is sorted in ascending order before being returned.
        //This optimization helps reduce the time complexity of finding divisors.

        for (int i = 1; i <= z; i++) {

            int x = n / i;//i not ==0 as i is in the denominator place.
            if (n % i == 0) {
                l2.add(0, i);
                if (x != i) {
                    l2.add(0, x);
                }
            }
        }

        Collections.sort(l2);  // Corrected the sorting method

        return l2;
    }
}
/* the optimal method basically the logic is if 'a'  is divisible by 'b' then a can alo be divisible by the remainder of a/b  */