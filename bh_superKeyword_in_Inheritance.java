class bh_student {
    int roll = 43;
}

class bh_st extends bh_student {
    int roll = 97;
    void show () {
        System.out.println(roll);
        System.out.println(super.roll);         // this super keyword takes value of the variable from just immediate parent.
        // ( if child -> parent -> grandParent.    then, if this super keyword is used in child class, then super keyword will take value of the variable from parent class(just immediate upper class), and not from grandparent class)
    }
}
class bh_superKeyword_in_Inheritance {
    public static void main(String args[]) {
        bh_st obj = new bh_st();
        obj.show();
    }
}