package sk.lukasdancak.stayonapp.controller;

import sk.lukasdancak.stayonapp.model.Model;
import sk.lukasdancak.stayonapp.view.GlobalUI;

import java.awt.*;
import java.sql.Time;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

public class Controller {
    GlobalUI uiSolution;
    Model model;
    boolean isTimerOn = false;
    int seconds;
    LocalTime localTime;
    DateTimeFormatter dtf = DateTimeFormatter.ISO_LOCAL_TIME;
    PointerInfo a; // position of mouse
    Point b; //point of mouse posiiton, from PointerInfo
    int x;
    int y;
    Robot r;

    Random rand = new Random();



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
                moveMouseCursor();
            }

        }
    }

    private void moveMouseCursor() {
        a = MouseInfo.getPointerInfo();
        b = a.getLocation();
        x = (int) b.getX();
        y = (int) b.getY();

        try {
            r = new Robot();
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
        r.mouseMove(x+myRandomInt(), y + myRandomInt());
    }

    //generates random int number from (-100) to (+100)
    private int myRandomInt(){
        // master:  random.nextInt(max - min) + min ; my min =-100, my max=100
        return rand.nextInt(100 +100)-100;
    }

    public void stopTimer() {
        isTimerOn=false;
    }

    public void startTimer() {
        isTimerOn=true;
        seconds=0;
    }
}
