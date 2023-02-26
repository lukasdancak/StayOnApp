package sk.lukasdancak.stayonapp.controller;

import sk.lukasdancak.stayonapp.model.Model;
import sk.lukasdancak.stayonapp.view.GlobalUI;

import java.awt.*;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

public class Controller {
    GlobalUI uiSolution;
    Model model;
    boolean isTimerOn = false;
    int seconds;
    LocalDateTime actualDateTime;
    LocalDateTime atStartOfCounter;

    DateTimeFormatter dtf = DateTimeFormatter.ISO_LOCAL_TIME;
    DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("HH:mm:ss");
    PointerInfo a; // position of mouse
    Point b; //point of mouse posiiton, from PointerInfo
    int x;
    int y;
    Robot r;
    long noOfSeconds;

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

            actualDateTime =LocalDateTime.now();
            uiSolution.setLocalTimeLabel( actualDateTime.withNano(0).format(dtf).toString() );
            if(isTimerOn){
                noOfSeconds = atStartOfCounter.until(actualDateTime, ChronoUnit.SECONDS);

                seconds++;
                uiSolution.setTimerLabel(String.format("%d:%02d:%02d", noOfSeconds / 3600, (noOfSeconds % 3600) / 60, (noOfSeconds % 60)));
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
        atStartOfCounter=null;
    }

    public void startTimer() {
        isTimerOn=true;
        atStartOfCounter= LocalDateTime.now();
        seconds=0;
    }
}
