package sk.lukasdancak.stayonapp.view;

import javax.swing.*;
import java.awt.*;

public class MyJFrame extends JFrame {

    public MyJFrame() throws HeadlessException {
        this.setTitle("StayOn application"); // set title of frame
        this.setDefaultCloseOperation(MyJFrame.EXIT_ON_CLOSE); // set exit from application
        this.setResizable(false); // resizing of window/frame not allowed
        this.setSize(800,800); // size of window
        this.setVisible(true); // make this visible

    }
}
