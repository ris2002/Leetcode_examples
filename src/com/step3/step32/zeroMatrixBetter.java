package com.step3.step32;
import java.util.ArrayList;
public class zeroMatrixBetter {
    public static ArrayList<ArrayList<Integer>> zeroMatrix(ArrayList<ArrayList<Integer>> matrix, Integer n, Integer m) {
        // Write your code here.
        boolean[] zeroRows = new boolean[n];
        boolean[] zeroCols = new boolean[m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix.get(i).get(j) == 0) {
                    zeroRows[i] = true;
                    zeroCols[j] = true;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (zeroRows[i] || zeroCols[j]) {
                    matrix.get(i).set(j, 0);
                }
            }
        }
        return matrix;
    }
}
