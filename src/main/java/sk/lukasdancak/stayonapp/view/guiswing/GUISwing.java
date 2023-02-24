package sk.lukasdancak.stayonapp.view.guiswing;

import sk.lukasdancak.stayonapp.controller.Controller;
import sk.lukasdancak.stayonapp.view.GlobalUI;
import sk.lukasdancak.stayonapp.view.guiswing.myjframe.MyJFrame;

import javax.swing.*;


public class GUISwing extends GlobalUI {

    MyJFrame myJFrame; //variable for my JFrame
    public GUISwing() {

// task: LookAndFeel
//        try {
//            UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
//        } catch (Exception e) {//code
//             }

        //creates window
        myJFrame = new MyJFrame();
        myJFrame.startButton.addActionListener(e->startPressed());

    }

    private void startPressed() {
    }


    @Override
    public void setClocklabel() {

    }

    @Override
    public void setTimerLabel() {

    }

    @Override
    public void closeUI() {
        //code

    }


}
