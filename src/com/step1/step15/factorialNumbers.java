package com.step1.step15;
import java.util.ArrayList;
import java.util.List;

public class factorialNumbers { public static List<Long> factorialNumbers(long n) {
    List<Long> result = new ArrayList<>();
    return helpFac(n, 1, 1, result);
}

    public static List<Long> helpFac(long n, long i, long x, List<Long> result) {
        if (x<=n) {
            result.add(x);
            i = i + 1;
            x = x * i;


            return helpFac(n, i, x, result);
        }
        return result;
    }
}
