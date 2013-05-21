/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.BaseController;
import Controllers.ShowIncomesController;
import Model.Income;
import eapli.util.Console;
import java.util.List;

/**
 *
 * @author Jose Nuno Loureiro
 */
public class ShowIncomesUI extends BaseUI {

    ShowIncomesController controller = new ShowIncomesController();

    public void run() {
        int op;
        do {
            op = menu();
            switch (op) {
                case 0:
                    System.out.println(" End show incomes");
                    break;
                case 1:
                    List<Income> list = controller.getAllIncomes();
                    displayList(list);
                    break;
                default:
                    System.out.println("Wrong option. Please repeat");
                    break;
            }
        } while (op != 0);
    }

    private int menu() {
        System.out.println("* * *  SHOW INCOMES  * * *\n");
        System.out.println("1. All Incomes");
        System.out.println("0. End show incomes\n\n");
        int op = Console.readInteger("Choose an option");
        return op;
    }

    private void displayList(List<Income> list) {
        int i = 0;
        System.out.println("List of Incomes");
        for (Income inc : list) {
            i = i + 1;
            System.out.println("Income " + i + "\n" + inc);
        }
    }

    @Override
    protected BaseController controller() {
        return controller;
    }

    @Override
    public void header() {
        System.out.println("------------ SHOW INCOMES ------------");
    }

}
