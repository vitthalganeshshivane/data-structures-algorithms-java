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

    public static void main(String args[]) {
        Fish shark = new Fish();
        shark.eat();
        Dog dobby = new Dog();
        dobby.legs = 4;
        System.out.println(dobby.legs);

    }
}
