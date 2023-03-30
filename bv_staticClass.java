class student {
    static String section = "k21dp";
    String uni = "LPU";
    static class studentdetail{
        void detail() {
            System.out.println("Section of student is : " + section);
            // System.out.println("University of student is : " + uni);     // since this is a static class, therefore it will only take static variables. if static variable is not provided, then it will throw errors.
        }
    }
}

public class bv_staticClass {
    public static void main(String args[]) {
        student.studentdetail sd = new student.studentdetail();
        sd.detail();
    }
}