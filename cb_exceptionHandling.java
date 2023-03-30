public class cb_exceptionHandling {
    public static void main(String args[]) {

        try{
            String str = null;
            System.out.println(str.toUpperCase());
        }
        catch(ArithmeticException e) {
            System.out.println(e);
        }
        catch(NumberFormatException e) {
            System.out.println(e.toString());
        }
        catch(NullPointerException e) {
            e.printStackTrace();
        }
        catch(Exception e) {                // we can only add this universal catch handler (Exception parent class) at the end of all other catch blocks because if we put this above all other catch blocks, then logically every exception will be caught by this block only and other catch blocks will never execute. And actually what happens is : if we pput this block above all catch blocks then it will give error.
            System.out.println(e.getMessage());
        }
    }
}