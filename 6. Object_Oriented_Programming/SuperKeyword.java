public class SuperKeyword {

    static class Animal {
        String color;

        Animal() {
            System.out.println("Animal constructor is called");
        }
    }

    static class Horse extends Animal {
        Horse() {
            super.color = "Black";
            System.out.println("Horse constructor is called");
        }
    }

    public static void main(String args[]) {
        Horse h1 = new Horse();

    }
}
