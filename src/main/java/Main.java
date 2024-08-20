import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //use bubble sort algorithm from BubbleSort class to sort a list of integers.
        System.out.println("Bubble Sort\n**************");
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(64, 34, 25, 2, 12, 90, 22, 44, 11, 81));
        System.out.println("Original list:\n" + list);
        BubbleSort.bubbleSort(list);
        System.out.println("Sorted list: \n" + list);

        //use quick sort algorithm from QuickSort class to sort a list of integers.
        System.out.println("\n**************\nQuick Sort\n**************");
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(64, 34, 25, 2, 12, 90, 22, 44, 11, 81));
        System.out.println("Original list:\n" + list2);
        QuickSort.quickSort(list2, 0, 9);
        System.out.println("Sorted list: \n" + list2);
    }
}
