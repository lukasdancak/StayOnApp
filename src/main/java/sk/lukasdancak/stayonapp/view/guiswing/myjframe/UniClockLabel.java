package sk.lukasdancak.stayonapp.view.guiswing.myjframe;

import javax.swing.*;
import java.awt.*;

public class UniClockLabel extends JLabel {

    public UniClockLabel() {
        this.setBackground(Color.GRAY); // this will set background color
        this.setOpaque(true); // this will display background color

        this.setForeground(Color.WHITE);
        this.setBorder(BorderFactory.createLineBorder(Color.BLUE));

        this.setHorizontalAlignment(JLabel.CENTER);
        this.setVerticalAlignment(JLabel.CENTER);
    }
}
