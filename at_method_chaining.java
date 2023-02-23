import java.util.*;

class at_demo {
    void display() {
        System.out.println("I am display method");
    }

    void show() {
        this.display();     // method chaining
        System.out.println("I am show method");
    }
}

public class at_method_chaining {
    public static void main(String t[]) {
        at_demo d = new at_demo();
        d.show();
    }
}
