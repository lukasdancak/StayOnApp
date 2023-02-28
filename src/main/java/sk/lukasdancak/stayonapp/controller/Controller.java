package sk.lukasdancak.stayonapp.controller;

import sk.lukasdancak.stayonapp.model.Model;
import sk.lukasdancak.stayonapp.view.GlobalUI;

import java.awt.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

public class Controller {
    GlobalUI uiSolution;
    Model model;
    boolean isTimerOn = false;
    LocalDateTime actualDateTime;
    LocalDateTime atStartDaT;
    DateTimeFormatter dtf = DateTimeFormatter.ISO_LOCAL_TIME;
    PointerInfo a; // position of mouse
    Point b; //point of mouse posiiton, from PointerInfo
    int x;
    int y;
    Robot r;
    long numOfSec;
    int periodOfMove=60;
    Random rand = new Random();
    int cursorMoveRange=10;


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
                throw new RuntimeException(e); // ???
            }

            actualDateTime =LocalDateTime.now();
            uiSolution.setLocalTimeLabel( actualDateTime.withNano(0).format(dtf).toString() );
            if(isTimerOn){
                numOfSec = atStartDaT.until(actualDateTime, ChronoUnit.SECONDS);
                uiSolution.setTimerLabel(String.format("%d:%02d:%02d", numOfSec / 3600, (numOfSec % 3600) / 60, (numOfSec % 60)));
                if(numOfSec %periodOfMove==0){moveMouseCursor();} //move only evry X seconds
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
        return rand.nextInt(cursorMoveRange +cursorMoveRange)-cursorMoveRange;
    }

    public void stopTimer() {
        isTimerOn=false;
        atStartDaT =null;
    }

    public void startTimer() {
        isTimerOn=true;
        atStartDaT = LocalDateTime.now();

    }
}
