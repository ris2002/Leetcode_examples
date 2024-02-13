package com.step3.step32;

public class spiral {
    public static int[] spiralMatrix(int[][] MATRIX) {
        if (MATRIX == null || MATRIX.length == 0 || MATRIX[0].length == 0) {
            return new int[0]; // Empty matrix, return empty array
        }

        int n = MATRIX.length;
        int m = MATRIX[0].length;
        int totalElements = n * m;
        int[] result = new int[totalElements];

        int top = 0, bottom = n - 1, left = 0, right = m - 1;
        int k = 0; // index for result array

        while (k < totalElements) {
            // Traverse top row
            for (int i = left; i <= right && k < totalElements; i++) {
                result[k++] = MATRIX[top][i];
            }
            top++;//this ensures that the next traversal starts from 2nd row

            // Traverse right column
            for (int i = top; i <= bottom && k < totalElements; i++) {
                result[k++] = MATRIX[i][right];
            }
            right--;

            // Traverse bottom row
            for (int i = right; i >= left && k < totalElements; i--) {
                result[k++] = MATRIX[bottom][i];
            }
            bottom--;

            // Traverse left column
            for (int i = bottom; i >= top && k < totalElements; i--) {
                result[k++] = MATRIX[i][left];
            }
            left++;
        }
        return result;
    }
}
