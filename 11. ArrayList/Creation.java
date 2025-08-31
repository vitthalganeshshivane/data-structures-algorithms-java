import java.util.ArrayList;

public class Creation {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();

        // Add element - O(1)
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);

        // add value at a perticular index - O(n)
        list.add(4, 11);
        System.out.println(list);

        // Get Element - O(1)
        int element = list.get(2);
        System.out.println(element);

        // Delete element - O(n)
        list.remove(1);
        System.out.println(list);

        // set element at index - O(n)
        list.set(2, 10);
        System.out.println(list);

        // contains element - return boolean value - O(n)
        System.out.println(list.contains(1));
        System.out.println(list.contains(11));

    }
}
