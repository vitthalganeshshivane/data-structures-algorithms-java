import java.util.*;

public class Operations {

    public static void update(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }

    public static void main(String args[]) {
        int marks[] = new int[100];

        Scanner sc = new Scanner(System.in);

        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        marks[3] = sc.nextInt();

        System.out.println("phy: " + marks[0]);
        System.out.println("che: " + marks[1]);
        System.out.println("math: " + marks[2]);

        double percentage = (marks[0] + marks[1] + marks[2]) / 3;
        System.out.println("percentage = " + percentage + "%");

        // Arrays as a function arguments
        int mark[] = { 80, 90, 79 };

        update(mark);

        for (int i = 0; i < marks.length; i++) {
            System.out.println(mark[i]);
        }
    }
}
