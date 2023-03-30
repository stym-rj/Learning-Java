interface marks{
    public void getmarks();
}

public class bw_lambdaExpressions {
    public static void main(String args[])  {
        int x = 67;
        int y = 432;
        int z = 23;
        
        marks m1 = ()-> {
            System.out.println("marks of students 1 is : " + x);
        };
        m1.getmarks();

        marks m2 = ()->{
            System.out.println("Marks of student 2 is : " + y);
        };
        m2.getmarks();
        
        marks m3 = ()-> {
            System.out.println("Marks of student 3 is : " + z);
        };
        m3.getmarks();
    }
}
