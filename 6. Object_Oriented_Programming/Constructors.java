// public class Constructors {
//     public static void main(String args[]) {
//         Student s1 = new Student("Pankaj");
//     }

//     static class Student {
//         String name;
//         int roll;

//         Student(String name) {
//             this.name = name;
//         }
//     }
// }

// types of Constructors
// 1. parameterized
// 2. non-parameterized
// 3. copy-Constructor

public class Constructors {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.name = "Vitthal";
        s1.roll = 149;
        s1.password = "abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Student s2 = new Student(s1);
        s2.password = "xyz";

        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }

    }

    static class Student {
        String name;
        int roll;
        String password;
        int marks[];

        // shallow copy constructor
        // Student(Student s1) {
        // marks = new int[3];
        // this.name = s1.name;
        // this.roll = s1.roll;
        // this.marks = s1.marks;
        // }

        // deep copy constructor
        Student(Student s1) {
            marks = new int[3];
            this.name = s1.name;
            this.roll = s1.roll;
            this.marks = s1.marks;
            for (int i = 0; i < marks.length; i++) {
                this.marks[i] = s1.marks[i];
            }
        }

        Student() {
            marks = new int[3];
            System.out.println("Constructor is called.....");
        }

        Student(String name) {
            marks = new int[3];
            this.name = name;
        }
    }
}
