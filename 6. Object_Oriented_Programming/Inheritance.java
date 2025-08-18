public class Inheritance {

    // 1. single lever inheritance
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

    // 2. multi-level inheritance

    static class Mammal extends Animal {
        int legs;
    }

    static class Dog extends Mammal {
        String breed;
    }

    // 3. Hierarchial Inheritance (multiple child ro derived classes classes from a
    // single base or
    // parent class)
    static class Mammals extends Animal {
        void walk() {
            System.out.println("Walk");
        }
    }

    static class Fish1 extends Animal {
        void swim() {
            System.out.println("Swim");
        }
    }

    static class Bird extends Animal {
        void fly() {
            System.out.println("fly");
        }
    }

    public static void main(String args[]) {
        Fish shark = new Fish();
        shark.eat();
        Dog dobby = new Dog();
        dobby.legs = 4;
        System.out.println(dobby.legs);

    }
}
