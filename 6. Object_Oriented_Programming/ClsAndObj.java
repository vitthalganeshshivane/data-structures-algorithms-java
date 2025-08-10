public class ClsAndObj {
    public static void main(String args[]) {
        Pen p1 = new Pen();
        p1.setColor("blue");
        p1.setTip(5);
        System.out.println(p1.color);
        System.out.println(p1.tip);
    }
}

class Pen {
    String color;
    int tip;

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}

class Student {
    String name;
    int age;
    float percentage;

    void calcPercentage(int phy, int chem, int math) {
        percentage = (phy + chem + math) / 3;
    }
}
