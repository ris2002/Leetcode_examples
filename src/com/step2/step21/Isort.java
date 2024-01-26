package com.step2.step21;

public class Isort {
    public static void insertionSort(int[] arr, int size) {
        for (int i = 0; i < size - 1; i++) {
            inHelp(arr, i);
        }
    }

    public static void inHelp(int[] arr, int s) {
        int current = s;
        while (current >= 0 && arr[current] > arr[current + 1]) {
            swap(arr, current, current + 1);
            current--;
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
/*I understand, and I'll try to provide a similar breakdown for the insertion sort algorithm. Insertion sort builds the sorted array one element at a time by taking elements from the unsorted part and inserting them into their correct positions in the sorted part.

Here's a breakdown of the pattern for insertion sort:

Step 1:

Initially, consider the first element as the sorted part.
The unsorted part starts from the second element onward.
Step 2:

Take the first element from the unsorted part and compare it with the elements in the sorted part.
Insert it into its correct position in the sorted part.
Step 3:

Move to the next element in the unsorted part.
Compare it with the elements in the sorted part and insert it into its correct position.
Step 4:

Repeat steps 2 and 3 until all elements are in their correct positions.
Let's go through an example for better understanding:

Consider the array: [5, 2, 4, 3, 1].

Step 1:

csharp
Copy code
[5, | 2, 4, 3, 1]
 ^  sorted  unsorted
Step 2:

csharp
Copy code
[2, 5, | 4, 3, 1]
       ^  sorted  unsorted
Step 3:

csharp
Copy code
[2, 4, 5, | 3, 1]
            ^  sorted  unsorted
Step 4:

csharp
Copy code
[2, 3, 4, 5, | 1]
               ^  sorted  unsorted
Step 5:

csharp
Copy code
[1, 2, 3, 4, 5|]
                  ^  sorted  unsorted
In each step, the algorithm takes an element from the unsorted part, compares it with the elements in the sorted part, and inserts it into its correct position. This process continues until the entire array is sorted.

The key difference from selection sort is that insertion sort builds the sorted part by inserting elements in their correct positions, whereas selection sort builds the sorted part by finding the minimum element and swapping it with the current element.*/