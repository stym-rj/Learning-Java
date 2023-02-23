class bi_student {
    void display() {
        System.out.println("hello");
    }
}

class bi_st extends bi_student {
    void display() {
        System.out.println("bye");
    }

    void show () {
        super.display();
        display();
    }
}

public class bi_superKeyword_in_methods {
    public static void main(String args[]) {
        bi_st obj = new bi_st();
        obj.show();
    }
}
