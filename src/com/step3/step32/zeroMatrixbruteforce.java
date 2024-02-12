package com.step3.step32;
import java.util.ArrayList;
public class zeroMatrixbruteforce {public static ArrayList<ArrayList<Integer>> zeroMatrix(ArrayList<ArrayList<Integer>> matrix, Integer n, Integer m) {
    // Write your code here.
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            if (matrix.get(i).get(j) == 0) {
                markRow(matrix, i, m);
                markCol(matrix, j, n);
            }
        }
    }


    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(matrix.get(i).get(j)==-1){
                matrix.get(i).set(j,0);
            }
        }
    }
    return matrix;
}

    public static void markRow(ArrayList<ArrayList<Integer>> matrix, int row, int m) {
        for (int j = 0; j < m; j++) {
            if (matrix.get(row).get(j) != 0) {
                matrix.get(row).set(j, -1);
            }
        }
    }

    public static void markCol(ArrayList<ArrayList<Integer>> matrix, int col, int n) {
        for (int i = 0; i < n; i++) {
            if (matrix.get(i).get(col) != 0) {
                matrix.get(i).set(col, -1);
            }
        }
    }
}
