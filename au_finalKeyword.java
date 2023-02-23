class au_demo {
    final int x = 10;
    
    void show() {
        // x = 34;     // this will throw error because variable 'x' has the final keyword.
        System.out.println(x);
    }
}
public class au_finalKeyword {
    public static void main(String args[])  {
        au_demo a = new au_demo();
        a.show();
    }
}