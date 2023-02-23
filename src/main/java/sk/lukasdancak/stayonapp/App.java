package sk.lukasdancak.stayonapp;

import sk.lukasdancak.stayonapp.controller.Controller;
import sk.lukasdancak.stayonapp.model.Model;
import sk.lukasdancak.stayonapp.view.GlobalUI;

import sk.lukasdancak.stayonapp.view.guiswing.GUISwing;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Model model = new Model();
        GlobalUI uiSolution = new GUISwing();
        Controller controller = new Controller(uiSolution,model);
        uiSolution.add(controller);
        controller.run();

    }
}
