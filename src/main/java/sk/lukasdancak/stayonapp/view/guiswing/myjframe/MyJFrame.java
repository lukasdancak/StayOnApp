package sk.lukasdancak.stayonapp.view.guiswing.myjframe;

import javax.swing.*;
import java.awt.*;

public class MyJFrame extends JFrame {
    public ClockLabel clockLabel;
    public ClockLabel localTimeLabel;
    public StartButton startButton;
    StopButton stopButton;

    public MyJFrame() throws HeadlessException {
        this.setTitle("StayOn application"); // set title of frame
        this.setDefaultLookAndFeelDecorated(true);
        this.setDefaultCloseOperation(MyJFrame.EXIT_ON_CLOSE); // set exit from application
        this.setResizable(false); // resizing of window/frame not allowed
        this.setSize(500,500); // size of window
        this.setVisible(true); // make this visible
        //task:  add image icon
        //task: change color of ContentPane
        JPanel c = (JPanel) this.getContentPane();
        this.getContentPane().setLayout(null);

        //local time label
        clockLabel = new ClockLabel();
        c.add(clockLabel);
        //counter label
        localTimeLabel = new ClockLabel();
        localTimeLabel.setBounds(250,50,200,100); // need to put to specific class
        c.add(localTimeLabel);
        //start button
        startButton=new StartButton();
        c.add(startButton);
        //stop button
        stopButton=new StopButton();
        c.add(stopButton);

    }

    public StartButton getStartButton() {
        return startButton;
    }

    public StopButton getStopButton() {
        return stopButton;
    }
}
