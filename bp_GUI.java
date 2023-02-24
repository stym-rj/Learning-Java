// javax.swing library is used to create GUI in java

import javax.swing.*;
public class bp_GUI {
    public static void main(String args[]) {
        JFrame f = new JFrame("hello hello");       // the passed parameter is set to the title of the frame. If no parameters is passed then there will be a default title of the frame.
        f.setSize(500, 600);
        f.setVisible(true);
    }
}
