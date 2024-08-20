import java.util.ArrayList;
import java.util.Collections;

public class BubbleSort {

    /**
     * Sort a list of integers from smallest to largest by comparing each one to it's neighbor and swapping if needed.
     * @param arr an Array List of integers.
     */
    public static void bubbleSort(ArrayList<Integer> arr) {
        //value used to decide if the loop can be exited or not
        boolean swapped;
        //outer loop for comparing integers
        for (int i = 0; i < arr.size() - 1; i++) {
            swapped = false;

            //inner loop for comparing integers and swapping. If it runs through the loop and none are swapped, the algorithm is finished and breaks.
            for (int j = 0; j < arr.size() - 1 - i; j++) {
                if (arr.get(j) > arr.get(j + 1)) {
                    Collections.swap(arr, j, j + 1);
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

}

