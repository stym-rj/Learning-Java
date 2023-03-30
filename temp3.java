final class Complex {
    private final double re;
    private final double im;
    public Complex (double re, double im) {
        this.re = re;
        this.im = im;
    }
    public String toString() {
        return "(" + re + " + " + im + "i)";
    }
}

public class temp3 {
    public static void main(String args[]) {
        Complex c = new Complex(5, 15);
        System.out.println("complex number is " + c);
    }
}
