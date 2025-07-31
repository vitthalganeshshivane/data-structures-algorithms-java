package Questions.Array;

import java.util.*;

public class Ceiling {

    public static int ceilingOfNumber(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (target == arr[mid]) {
                return arr[mid];
            }

            if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start;
    }

    public static void main(String args[]) {
        int arr[] = { 2, 3, 5, 9, 14, 16, 18 };
        int target = 15;
        System.out.println(ceilingOfNumber(arr, target));
    }
}
