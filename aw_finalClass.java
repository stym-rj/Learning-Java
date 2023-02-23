final class aw_demo {
    void show() {
        System.out.println("I m final method");
    }
}

public class aw_finalClass extends aw_demo {
    void show() {
        System.out.println("I m not final method");
    }
    public static void main(String args[]) {
        aw_demo d = new aw_demo();
        d.show();
    }
}
