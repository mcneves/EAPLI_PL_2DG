/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import eapli.ExpenseBootStrapper;
import eapli.ExpenseTypeBootStrapper;

/**
 *
 * @author 
 */
public class ExpenseManager {

      /**
       * @param args the command line arguments
       */
      public static void main(String[] args) {
            ExpenseBootStrapper boot=new ExpenseBootStrapper();
            ExpenseTypeBootStrapper bootType = new ExpenseTypeBootStrapper();
            MainMenu menu = new MainMenu();
            menu.mainLoop();
      }
}