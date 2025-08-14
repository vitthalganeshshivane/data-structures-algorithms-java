public class PrintNums {

    public static void printDec(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            System.out.println();
            return;
        }
        System.out.print(n + " ");
        printDec(n - 1);

    }

    public static void printInc(int n) {
        if (n == 10) {
            System.out.print(n + " ");
            return;
        }
        System.out.print(n + " ");
        printInc(n + 1);
    }

    public static void main(String args[]) {
        int n = 10;
        printDec(n);
        printInc(1);
    }
}
