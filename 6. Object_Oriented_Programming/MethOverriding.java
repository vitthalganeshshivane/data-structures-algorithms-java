public class MethOverriding {

    static class Animal {
        void eat() {
            System.out.println("Eats anything");
        }
    }

    static class Deer extends Animal {
        void eat() {
            System.out.println("Eats Grass");
        }
    }

    public static void main(String args[]) {
        Deer d = new Deer();
        d.eat();
    }
}
