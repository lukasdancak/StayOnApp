package sk.lukasdancak.stayonapp.view;

import sk.lukasdancak.stayonapp.controller.Controller;

import java.time.LocalTime;

public interface UiInterface {


    void setClocklabel ();
    void setTimerLabel(String text);

    void setLocalTimeLabel(String text);
    void add(Controller controller);
    void closeUI();
}
