public class GettersAndSetters {
    public static void main(String args[]) {
        Pen p1 = new Pen();
        p1.setColor("Blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());

        p1.setColor("Yellow");
        System.out.println(p1.getColor());

    }

    static class Pen {
        private String color;
        private int tip;

        // these functions are called as getters
        String getColor() {
            return this.color;
        }

        int getTip() {
            return this.tip;
        }

        // these functions are called as setters
        void setColor(String newColor) {
            this.color = newColor;
        }

        void setTip(int tip) {
            this.tip = tip;
        }
    }
}
