package sk.lukasdancak.stayonapp.view.guiswing;

import sk.lukasdancak.stayonapp.view.GlobalUI;
import sk.lukasdancak.stayonapp.view.guiswing.myjframe.MyJFrame;


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
        myJFrame.getStartButton().addActionListener(e->startPressed());
        myJFrame.getStopButton().addActionListener(e->stopPressed());


    }

    //call to controler
    private void stopPressed() {
        super.controller.stopTimer();
    }

    //call to controller
    private void startPressed() {
        super.controller.startTimer();
    }


    @Override
    public void setClocklabel() {

    }

    @Override
    public void setTimerLabel(String text) {
        myJFrame.durationLabel.updateTimeInLabel(text);

    }

    @Override
    public void setLocalTimeLabel(String text) {
        myJFrame.localTimeLabel.updateTimeInLabel(text);
    }

    @Override
    public void closeUI() {
        //code

    }


}
