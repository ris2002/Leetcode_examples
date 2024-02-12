package com.step3.step32;

public class rotatemat {
    public static void rotateMatrix(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int[][] matt = new int[m][n]; // Transpose the matrix

        for (int j = 0; j < m; j++) {
            for (int i = n - 1; i >= 0; i--) {
                matt[j][n - 1 - i] = mat[i][j];
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                mat[i][j]=matt[i][j];
            }
        }


    }
}
