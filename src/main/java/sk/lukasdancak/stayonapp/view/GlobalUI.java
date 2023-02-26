package sk.lukasdancak.stayonapp.view;

import sk.lukasdancak.stayonapp.controller.Controller;

public abstract class GlobalUI implements UiInterface {
   protected Controller controller;

   public Controller getController() {
      return controller;
   }
   public void add(Controller controller) {
      this.controller=controller;


   }
}
