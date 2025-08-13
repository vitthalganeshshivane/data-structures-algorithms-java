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

// types of Constructors
// 1. parameterized
// 2. non-parameterized
// 3. copy-Constructor