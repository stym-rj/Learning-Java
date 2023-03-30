class outer {       // this will generate outer.class byte code file
    private int roll = 32;
    class inner {       // this will generate outer$inner.class byte code file
        void rollno() {
            System.out.println("Student roll no is : " + roll);
        }
    }
}

public class bs_innerMemberClass {
    public static void main (String args[]) {
        outer o = new outer();
        outer.inner i = o.new inner();      // this is how we create the instance of inner class.
        i.rollno();
    }
}
