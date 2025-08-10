public class ClearLastIthBits {

    public static int clearIthLastBits(int n, int i) {
        int bitMask = (~0) << i;
        return n & bitMask;
    }

    public static void main(String args[]) {
        System.out.println(clearIthLastBits(15, 2));
    }
}
