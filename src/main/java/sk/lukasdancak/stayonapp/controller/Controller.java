package sk.lukasdancak.stayonapp.controller;

import sk.lukasdancak.stayonapp.model.Model;
import sk.lukasdancak.stayonapp.view.GlobalUI;

public class Controller {
    GlobalUI uiSolution;
    Model model;

    public Controller(GlobalUI uiSolution, Model model) {
        this.uiSolution = uiSolution;
        this.model = model;
    }

    public void run() {
    }
}
