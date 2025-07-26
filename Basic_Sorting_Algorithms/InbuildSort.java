package Basic_Sorting_Algorithms;

import java.util.Arrays;
import java.util.Collections;

public class InbuildSort {

    public static void printArr(Integer arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Integer arr[] = { 5, 4, 1, 3, 2 };

        // Arrays.sort(arr);
        // printArr(arr);

        // sort perticular part of an array by giving indexes as an arguments

        // Arrays.sort(arr, 0, 3);
        // printArr(arr);

        // descending order sorting
        Arrays.sort(arr, Collections.reverseOrder());
        printArr(arr);
    }
}
