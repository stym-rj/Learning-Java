import java.util.*;

class aq_compute {
    static void add (int a, int b) {
        int c = a + b;
        System.out.println("Result : " + c);
    }
}
public class aq_staticFunctions {
    public static void main (String args[]) {
        aq_compute.add(342, 4234);
    }
}
