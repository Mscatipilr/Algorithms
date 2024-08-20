

import java.util.ArrayList;

//import static java.util.Collections.sort;
import static java.util.Collections.swap;

public class QuickSort {
    // Partition method that places the pivot element in the correct position
    public static int partition(ArrayList<Integer> arr, int low, int high) {
        int pivot = arr.get(high);
        int i = low - 1; // Index of the smaller element

        for (int j = low; j < high; j++) {
            if (arr.get(j) <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }

//    static int sort(ArrayList<Integer> arr, int start, int last) {
//        int pivot = arr.get(last);
//        int index = start - 1;
//
//        for (int i = start; i < last; i++) {
//            if (arr.get(i) < pivot) {
//                index++;
//                swap(arr, index, i);
//            }
//        }
//        int pivotPosition = index++;
//
//    }
    public static void quickSort(ArrayList<Integer> arr, int low, int high) {
        if (low < high) {
            int par = partition(arr, low, high);

            //Recursively sort elements before partition and after partition
            quickSort(arr, low, par - 1);
            quickSort(arr, par + 1, high);
        }

    }
}
