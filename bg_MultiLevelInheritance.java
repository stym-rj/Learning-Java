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

// class appraisal {
//     final String aadhaar;
//     appraisal() {
//         aadhaar = "654598465464";
//         System.out.println(aadhaar);
//     }

// }

class bg_MultiLevelInheritance extends employee{
    public static void main(String args[]) {
        employee e = new employee();
        e.salary();
    
    }
}
