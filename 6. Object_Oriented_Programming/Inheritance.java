public class Inheritance {

    // base class or parent class
    static class Animal {
        String color;

        void eat() {
            System.out.println("eats");
        }

        void breathe() {
            System.out.println("breathes");
        }
    }

    // derived class or child class
    static class Fish extends Animal {
        int fins;

        void swim() {
            System.out.println("Swims in water");
        }
    }

    public static void main(String args[]) {
        Fish shark = new Fish();
        shark.eat();

    }
}
