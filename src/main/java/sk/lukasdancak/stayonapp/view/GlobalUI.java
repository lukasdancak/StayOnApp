package sk.lukasdancak.stayonapp.view;

import sk.lukasdancak.stayonapp.controller.Controller;

public abstract class GlobalUI implements UiInterface {
   private Controller controller;


   public Controller getController() {
      return controller;
   }

   public void setController(Controller controller) {
      this.controller = controller;
   }
}