package sk.lukasdancak.stayonapp.controller;

import sk.lukasdancak.stayonapp.model.Model;
import sk.lukasdancak.stayonapp.view.GlobalUI;

import java.sql.Time;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

public class Controller {
    GlobalUI uiSolution;
    Model model;
    boolean isTimerOn = false;
    int seconds;
    LocalTime localTime;
    DateTimeFormatter dtf = DateTimeFormatter.ISO_LOCAL_TIME;

    public Controller(GlobalUI uiSolution, Model model) {
        this.uiSolution = uiSolution;
        this.model = model;
        uiSolution.add(this);
    }

    public void run() {

        while(true) {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            localTime=LocalTime.now();
            uiSolution.setLocalTimeLabel( localTime.withNano(0).format(dtf).toString() );
            if(isTimerOn){
                seconds++;
                uiSolution.setTimerLabel(Integer.toString(seconds));
            }

        }
    }

    public void stopTimer() {
        isTimerOn=false;
    }

    public void startTimer() {
        isTimerOn=true;
        seconds=0;
    }
}
