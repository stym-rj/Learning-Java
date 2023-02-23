abstract class Student {
    abstract void roll();
    static void detail() {
        System.out.println("Student name is harsh");
    }

    Student() {
        System.out.println("Default constructor");
    }
}

public class bn_abstractClasses extends Student {
    void roll() {
        System.out.println("Student roll no is 45");
    }

    public static void main(String args[]) {
        Student s = new bn_abstractClasses();
        s.roll();
        Student.detail();
    }
}
