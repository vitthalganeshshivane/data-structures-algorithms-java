public class Constructors {
    public static void main(String args[]) {
        Student s1 = new Student("Pankaj");
    }

    static class Student {
        String name;
        int roll;

        Student(String name) {
            this.name = name;
        }
    }
}