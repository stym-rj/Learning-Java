// javax.swing library is used to create GUI in java

import javax.swing.*;
public class bp_GUI {
    public static void main(String args[]) {
        JFrame f = new JFrame("hello hello");       // the passed parameter is set to the title of the frame. If no parameters is passed then there will be a default title of the frame.

        f.setSize(500, 600);        // set size of the window of the frame.

        f.setResizable(false);      // this will not allow us to resize the window.

        f.setLocationRelativeTo(null);      // this will set the location of the frame in middle of the screen.

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       // this means that when we close the frame, then command line will also exit.


        f.setVisible(true);         // this is to be written at the last
    }
}
