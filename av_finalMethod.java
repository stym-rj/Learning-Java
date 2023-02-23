// final methods can't be overridden.

class av_demo {
    final void show() {
        System.out.println("hello, i m final method");
    }
}
public class av_finalMethod extends av_demo{        // this is how we inherit a class in java (Just a glimplse, to see the usage of final keyword.)

    void show() {       // this method will throw an error since there is a final method with the same name in av_demo class.  (If there is a final method, then we can't override it.)
        System.out.println("I am not final method");
    }
    public static void main(String args[]) {
        av_demo k = new av_demo();
        k.show();
    }
}
