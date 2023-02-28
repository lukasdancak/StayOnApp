package sk.lukasdancak.stayonapp.view.guiswing.myjframe;

import javax.swing.*;
import java.awt.*;

public class UniClockLabel extends JLabel {
    final String htmlPart1 ="<html><center><b>";
    String stringForName;
    final String htmlPart2="</b><br><font color=#ffffdd>";
    String stringForTime="0:00:00";
   final String htmlPart3="</font>";
   String labelTextSumPart1;
   String labelTextSumAll;

    public UniClockLabel(String nameOfLabel) {
        stringForName =nameOfLabel;
        this.setBackground(Color.GRAY); // this will set background color
        this.setOpaque(true); // this will display background color

        this.setForeground(Color.WHITE);
        this.setBorder(BorderFactory.createLineBorder(Color.BLUE));

        this.setHorizontalAlignment(JLabel.CENTER);
        this.setVerticalAlignment(JLabel.CENTER);
    }

    void createLabelTextSumPart1(){
        labelTextSumPart1=htmlPart1+ stringForName +htmlPart2;
    }
    void createLabelTextSumAll(){
        labelTextSumAll=labelTextSumPart1+stringForTime+htmlPart3;
    }
    public void updateTimeInLabel(String text){
        stringForTime=text;
        createLabelTextSumAll();
        setText(labelTextSumAll);
    }
}
