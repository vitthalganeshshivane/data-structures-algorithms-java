import java.util.*;

public class Strings {

    public static void printString(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }

    public static void main(String args[]) {
        // creation
        String name = "Pankaj";
        String name1 = new String("Vitthal");

        // Input and Output
        Scanner sc = new Scanner(System.in);
        // String fullName = sc.next(); // to get only one word as a input
        String fullName = sc.nextLine(); // to get whole line as a input

        // length of the string
        int length = fullName.length();
        System.out.println(fullName);
        System.out.println(length);

        // String concatenation
        String names = name + " and " + name1;
        System.out.println(names);

        printString(fullName);

    }
}