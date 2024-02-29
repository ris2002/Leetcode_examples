package com.step3.step33;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class mergeoverlapping {

    public static List<List<Integer>> mergeOverlappingIntervals(int[][] arr) {
        int n = arr.length;
        List<List<Integer>> matrix = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int L1 = arr[i][0];
            int R1 = arr[i][1];

            if (!matrix.isEmpty() && R1 >= matrix.get(matrix.size() - 1).get(1)) {
                continue; // skips loop
            }





    /*
    Q-what i am noticing that if I take out if (!matrix.isEmpty() && R1 >= matrix.get(matrix.size() - 1).get(1)) {
                continue; // skips loop
            } I am getting correct answer

If removing the condition (!matrix.isEmpty() && R1 >= matrix.get(matrix.size() - 1).get(1)) from your code produces the correct answer, it suggests that the condition might not be necessary for your specific scenario.

This condition is intended to check if the current interval overlaps with the last interval in the matrix list.
If there is an overlap, it skips adding the current interval to matrix to avoid duplicate or unnecessary entries.
However, if removing this condition doesn't affect the correctness of your output, it implies that your input intervals might not have
 overlapping segments or that the intervals are sorted in such a way that this condition is redundant.

In general, it's always a good practice to review and validate the conditions in your code, ensuring they match the requirements
of your specific problem. If a condition is unnecessary or doesn't affect the output, removing it can simplify your code without
sacrificing correctness. However, be cautious and make sure to test your code thoroughly with different inputs to ensure its correctness
in various scenarios.


            */




            for (int j = i + 1; j < n; j++) {
                int L2 = arr[j][0];
                int R2 = arr[j][1];
                if (L2 <= R1) {
                    R1 = Math.max(R2, R1);
                    i++;
                } else {
                    break;
                }
            }
            matrix.add(Arrays.asList(L1, R1));
        }
        return matrix;
    }
}
