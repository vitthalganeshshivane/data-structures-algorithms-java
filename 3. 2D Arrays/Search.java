import java.util.*;

public class Search {

    public static boolean searchElement(int matrix[][], int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("The element found at ( " + i + " , " + j + " )");
                    return true;
                }
            }
        }
        System.out.println("Key not found");
        return false;
    }

    public static void main(String args[]) {
        int matrix[][] = new int[3][3];
        int m = matrix.length, n = matrix[0].length;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();
        }

        searchElement(matrix, 5);
    }

}
