interface Employee {
    void salary();
}

public class bl_interfaces implements Employee{         // to inherit interface in a class, we use "implements" keyword.
    public void salary() {
        System.out.println("Salary is 5 Rs.");
    }
    public static void main(String args[]) {
        bl_interfaces obj = new bl_interfaces();
        obj.salary();

        Employee e = new bl_interfaces();
        e.salary();
    }
}