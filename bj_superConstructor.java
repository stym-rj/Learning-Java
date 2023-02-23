class bj_student {
    bj_student() {
        System.out.println("Parent class ka constructor");
    }
}

class bj_st extends bj_student{
    bj_st() {
        super();
    }
}

public class bj_superConstructor {
    public static void main(String args[]) {
        bj_st obj = new bj_st();
    }
}
