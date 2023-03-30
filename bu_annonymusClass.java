abstract class employee {
    abstract void detail();
}

public class bu_annonymusClass {
    public static void main(String args[]) {
        employee e = new employee() {
            public void detail() {
                System.out.println("employee name is : satyam");
                System.out.println("employee age is : 64");
            }
        };
        e.detail();
    }
}
