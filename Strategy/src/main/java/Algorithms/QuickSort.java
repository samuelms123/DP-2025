package Algorithms;

import java.util.ArrayList;
import java.util.List;

// Fast versatile sorting algorithm
// Faster than counting sort when dealing with large integers

public class QuickSort implements SortingStrategy {
    @Override
    public void sort(ArrayList<Integer> list) {
        quickSort(list, 0, list.size() - 1);
    }

    public void quickSort(ArrayList<Integer> list, int startIndex, int endIndex) {

        if (endIndex <= startIndex) {return;} // list in correct order, no need for more pivoting

        int pivot  = partition(list, startIndex, endIndex); // find pivot point
        quickSort(list, startIndex, pivot - 1); // list left of the pivot point
        quickSort(list, pivot + 1, endIndex); // list right of the pivot point
    }

    public int partition(ArrayList<Integer> list, int startIndex, int endIndex) {
        int pivot = list.get(endIndex);
        int i = startIndex - 1;

        for (int j = startIndex; j <= endIndex - 1; j++) {
            if (list.get(j) < pivot) {
                i++;
                int temp = list.get(i);
                list.set(i, list.get(j));
                list.set(j, temp);
            }
        }
        i++;
        int temp = list.get(i);
        list.set(i, list.get(endIndex));
        list.set(endIndex, temp);

        return i; // pivot location in the given list
    }
}
