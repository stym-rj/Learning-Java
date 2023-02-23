class employee {
    final String pan;
    employee() {
        pan = "flkjds3r4";
        System.out.println(pan);
    }

    void salary () {
        System.out.println("Salary of the employee is : 300000");
    }
}

class bf_SingleInheritance extends employee{
    public static void main(String args[]) {
        employee e = new employee();
        e.salary();
    }
}