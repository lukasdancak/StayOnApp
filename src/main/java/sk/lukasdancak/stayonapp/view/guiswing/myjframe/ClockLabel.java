package sk.lukasdancak.stayonapp.view.guiswing.myjframe;

import javax.swing.*;
import java.awt.*;

public class ClockLabel extends JLabel {

    public ClockLabel() {


        this.setText("label clock");

        this.setBackground(Color.GRAY); // this will set background color
        this.setOpaque(true); // this will display background color

        this.setForeground(Color.RED);
        this.setBorder(BorderFactory.createLineBorder(Color.BLUE));

        this.setHorizontalAlignment(JLabel.CENTER);
        this.setVerticalAlignment(JLabel.CENTER);

        //this.setSize(200,100);
        this.setBounds(50,50,200,100);



    }
}
