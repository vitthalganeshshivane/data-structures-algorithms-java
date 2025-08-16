public class IsArrSorted {

    public static boolean isSorted(int arr[], int i) {

        if (i == arr.length - 1) {
            return true;
        }

        if (arr[i] > arr[i + 1]) {
            return false;
        }

        return isSorted(arr, i + 1);
    }

    public static void main(String args[]) {
        int arr1[] = { 1, 2, 3, 4, 6 };
        int arr2[] = { 4, 5, 3, 4, 6 };
        System.out.print("for sorted array ans is: ");
        System.out.println(isSorted(arr1, 0));
        System.out.print("for unsorted array ans is: ");
        System.out.print(isSorted(arr2, 0));
    }
}
