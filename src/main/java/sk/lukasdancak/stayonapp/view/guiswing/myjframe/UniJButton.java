package sk.lukasdancak.stayonapp.view.guiswing.myjframe;

import javax.swing.*;

public abstract class UniJButton extends JButton {

    public UniJButton(String text) {
        super(text);
        this.setFocusable(false);
    }
}
