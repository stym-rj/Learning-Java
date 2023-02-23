class ax_demo {
    final int x;
    ax_demo() {
        x = 43;
        System.out.println("Constructor called!");
    }

    void show() {
        System.out.println(x);
    }
}

public class ax_uninitialised_finalMethod {
    public static void main(String args[]) {
        ax_demo d = new ax_demo();
        d.show();
    }
}
