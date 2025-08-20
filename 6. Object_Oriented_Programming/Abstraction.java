public class Abstraction {

    static abstract class Animal {
        String color;

        Animal() {
            color = "brown";
        }

        void eat() {
            System.out.println("animal eats");
        }

        abstract void walk();
    }

    static class Horse extends Animal {

        void changeColor() {
            color = "dark brown";
        }

        void walk() {
            System.out.println("walks on 4 legs");
        }

    }

    static class Chicken extends Animal {

        void changeColor() {
            color = "yellow";
        }

        void walk() {
            System.out.println("Walks on 2 legs");
        }
    }

    public static void main(String args[]) {
        Horse h = new Horse();
        h.eat();
        h.walk();

        Chicken c = new Chicken();
        h.eat();
        h.walk();
        System.out.println(h.color);
    }
}
