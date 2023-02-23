import java.util.*;

class ar_employee {
    String name;
    int id;
    ar_employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void display() {
        System.out.println(name + ", " + id);
    }
}

public class ar_this_keyword {
    public static void main (String args[]) {
        ar_employee e1 = new ar_employee("satyam", 4432);
        e1.display();
    }
}