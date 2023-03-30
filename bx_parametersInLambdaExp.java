interface detail {
    public String namedetail(String name);
}

public class bx_parametersInLambdaExp {
    static String n1 = "foo", n2 = "bar";
    public static void main(String args[]) {
        // String n1 = "foo";
        // String n2 = "bar";
        // detail d1 = (n1) -> {
        //     // System.out.println(d1.namedetail("rachit"));
        //     d1.namedetail(n1);
        // };
        // detail d2 = n2 -> 
        //     System.out.println(d2.namedetail("hello"));

        detail d1 = (n1) -> {
            System.out.println("baz");
            return "my name is : " + n1;
        };
        System.out.println(d1.namedetail(n1));

        detail d2 = n2 -> {
            return "my name is : " + n2;
        };
        System.out.println(d2.namedetail(n2));
    }
}
