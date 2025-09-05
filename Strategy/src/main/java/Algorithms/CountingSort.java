package Algorithms;

import java.util.ArrayList;
import java.util.Arrays;

import static java.util.Collections.max;

// Fast when max integer relatively small and duplicate integers occur
// Only usable with integers

public class CountingSort implements SortingStrategy{
    @Override
    public void sort(ArrayList<Integer> list) {
        int maxNumber = max(list);

        // Create counting list
        int[] countArray = new int [maxNumber + 1];

        // Count every occurrence of integer
        for (int i = 0; i < list.size(); i++) {
            countArray[list.get(i)]++;
        }

        // sum integers
        for (int i = 1; i < countArray.length; i++) {
            countArray[i] += countArray[i - 1];
        }

        // Create output array in length of the original array
        int[] outputArray = new int[list.size()];

        // Place original list values to output array
        for (int i = 0; i < list.size(); i++) {
            int value = list.get(i); // Get first value
            int position = countArray[value] - 1; // Get position from the count array
            outputArray[position] = value; // Place the value to the count arrays index in output array
            countArray[value]--; // decrement the count array index value for possible duplicate integers
        }

    }
}
