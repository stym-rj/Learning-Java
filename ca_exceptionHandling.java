public class ca_exceptionHandling {
    public static void main(String args[]) {
        int c = 0;
        try {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            c = a / b;
            System.out.println(c);
        }
        catch(Exception e) {
            System.out.println("Method 1 : ");
            e.printStackTrace();                    // gives - > 1. exception type, 2. exception description, 3. exception line number(or position).

            System.out.println("Method 2 : ");
            System.out.println(e);                  // gives -> 1. exception type, 2. exception description.

            System.out.println("Method 3 : ");
            System.out.println(e.toString());       // gives -> 1. exception type, 2. exception description.

            System.out.println("Method 4 : ");
            System.out.println(e.getMessage());     // gives -> 1. exception description.
        }
        finally {                                   // this block is used to print the final outcome. (whether or not the exception is found, this block will always execute.)
            System.out.println("No exceptions found");
        }
    }
}