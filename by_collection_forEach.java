import java.util.*;

public class by_collection_forEach {
    public static void main(String args[]) {
        List<String> ls = new ArrayList<>();
        ls.add("foo");
        ls.add("bar");
        ls.add("baz");
        ls.add("foobar");
        ls.add("foobaz");

        ls.forEach((n) -> System.out.println(n));       // for each method.


        // for each loop :
        System.out.println("-----------------------------");
        for(Object x : ls) {
            System.out.println(x);
        }
    }
}
