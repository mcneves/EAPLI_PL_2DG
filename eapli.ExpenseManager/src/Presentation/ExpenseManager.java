/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import eapli.ExpenseBootStrapper;
import eapli.ExpenseTypeBootStrapper;
import eapli.IncomeBootStrapper;
import eapli.IncomeTypeBootStrapper;
import eapli.PaymentMeansBootStrapper;

/**
 *
 * @author
 */
public class ExpenseManager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ExpenseTypeBootStrapper bootType = new ExpenseTypeBootStrapper();
        IncomeTypeBootStrapper bootIncomeType = new IncomeTypeBootStrapper();
        IncomeBootStrapper bootIncome = new IncomeBootStrapper();
        PaymentMeansBootStrapper bootmeans = new PaymentMeansBootStrapper();
        ExpenseBootStrapper boot = new ExpenseBootStrapper();
        MainMenu menu = new MainMenu();
        menu.mainLoop();
    }
}
