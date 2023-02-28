package sk.lukasdancak.stayonapp.view.guiswing.myjframe;

import javax.swing.*;
import java.awt.*;

public class MyJFrame extends JFrame {
    public DurationTimeLabel durationLabel;
    public LocalTimeLabel localTimeLabel;
    public StartButton startButton;
    StopButton stopButton;

    public MyJFrame() throws HeadlessException {
        this.setTitle("StayOn application"); // set title of frame
        this.setDefaultLookAndFeelDecorated(true);
        this.setDefaultCloseOperation(MyJFrame.EXIT_ON_CLOSE); // set exit from application
        this.setResizable(false); // resizing of window/frame not allowed
        this.setSize(520,460); // size of window

        //task:  add image icon
        //task: change color of ContentPane
        JPanel c = (JPanel) this.getContentPane();
        this.getContentPane().setLayout(null);

        //duration time label
        durationLabel = new DurationTimeLabel();
        c.add(durationLabel);
        //local time label
        localTimeLabel = new LocalTimeLabel();
        c.add(localTimeLabel);
        //start button
        startButton=new StartButton();
        c.add(startButton);
        //stop button
        stopButton=new StopButton();
        c.add(stopButton);
        this.setVisible(true); // make this visible

    }

    public StartButton getStartButton() {
        return startButton;
    }

    public StopButton getStopButton() {
        return stopButton;
    }
}
