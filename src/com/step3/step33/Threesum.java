package com.step3.step33;
import java.util.*;
public class Threesum {
    public static List<List<Integer>> triplet(int n, int[] arr) {
        List<List<Integer>> matrix = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        Set<List<Integer>> set = new HashSet<>();
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int sum = -1*(arr[i] + arr[j]);
                if (map.containsKey(sum)) {
                    List<Integer> triplet = new ArrayList<>();
                    triplet.add(arr[i]);
                    triplet.add(arr[j]);
                    triplet.add(sum);
                    Collections.sort(triplet);


                    set.add(triplet);//uniqueness

                }

                map.put(arr[j], j);
            }
            map.clear();
        }
        matrix.addAll(set);
        Collections.sort(matrix, new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> list1, List<Integer> list2) {
                int compareFirst = list1.get(0).compareTo(list2.get(0));
                if (compareFirst != 0) {
                    return compareFirst;
                } else {
                    // If the first elements are equal, compare the second elements
                    int compareSecond = list1.get(1).compareTo(list2.get(1));
                    if (compareSecond != 0) {
                        return compareSecond;
                    } else {
                        // If the second elements are equal, compare the third elements
                        return list1.get(2).compareTo(list2.get(2));
                    }
                }
            }
        });
        return matrix;
    }
}
