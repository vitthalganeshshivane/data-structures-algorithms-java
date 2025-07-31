package Questions.Array;

// Q. Floor of a number 
// floor = greatest/biggest number that is smaller or = target
import java.util.*;

public class Floor {

    public static int floorOfNumber(int arr[], int target) {

        if (target > arr[arr.length - 1]) {
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (target == arr[mid]) {
                return mid;
            }

            if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return end;
    }

    public static void main(String args[]) {
        int arr[] = { 2, 3, 5, 9, 14, 16, 18 };
        int target = 14;
        System.out.println(floorOfNumber(arr, target));
    }
}
