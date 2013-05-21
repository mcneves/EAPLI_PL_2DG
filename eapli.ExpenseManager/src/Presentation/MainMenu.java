/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Persistence.Inmemory.PaymentMeansRepository;
import eapli.util.Console;

/**
 *
 * @author mcn
 */
public class MainMenu {

    public MainMenu() {
    }

    public void mainLoop() {
        int op;
        do {
            op = menu();
            switch (op) {
                case 0:
                    System.out.println("bye bye ...");
                    break;
                case 1:
                    ExpenseRegisterUI ui = new ExpenseRegisterUI();
                    ui.run();
                    break;
                case 2:
                    ShowExpensesUI showExpensesUI = new ShowExpensesUI();
                    showExpensesUI.loop();
                    break;
                case 3:
                    ExpenseTypeRegisterUI uiType = new ExpenseTypeRegisterUI();
                    uiType.run();
                    break;
                case 4:
                    ShowWeeklyExpensesUI SWE = new ShowWeeklyExpensesUI();
                    //SWE.run();
                    break;

                case 5:
                    //ShowMonthlyExpensesUI meUI=new ShowMonthlyExpensesUI();
                    //meUI.run();
                    break;
                case 6:
                    IncomeTypeRegisterUI incomeTypeUI = new IncomeTypeRegisterUI();
                    incomeTypeUI.run();
                    break;
                case 7:
                    IncomeRegisterUI incomeRegisterUI = new IncomeRegisterUI();
                    incomeRegisterUI.run();
                    break;
                case 8:
                    PaymentMeanUI pm= new PaymentMeanUI();
                    pm.run();
                    break;
                case 9:
                    ShowIncomesUI showIncomesUI = new ShowIncomesUI();
                    showIncomesUI.loop();
                    break;
                case 10:
                    ShowExpenseTypeUI showExpenseTypesUI = new ShowExpenseTypeUI();
                    showExpenseTypesUI.run();
                    break;
                case 11:
                    ShowIncomeTypeUI showIncomeTypeUI = new ShowIncomeTypeUI();
                    showIncomeTypeUI.run();
                    break;
                case 12:
                    ShowBalanceUI showBalanceUI = new ShowBalanceUI();
                    showBalanceUI.run();
                    break;
            }
        } while (op != 0);

    }

    private static int menu() {
        System.out.println("===================");
        System.out.println("  EXPENSE MANAGER  ");
        System.out.println("===================\n");
        System.out.println("1. Register an expense");
        System.out.println("2. Show expenses");
        System.out.println("3. Register expenses type");
        System.out.println("4. Show month expenses");
        System.out.println("6. Register income type");
        System.out.println("7. Register an income");
        System.out.println("8. Register Payment Mean");
        System.out.println("9. Show Incomes");
        System.out.println("10. Show Expense Types");
        System.out.println("11. Show Income Types");
        System.out.println("12. Show Balance");
        System.out.println("0. Exit\n\n");

        int option = Console.readInteger("Please choose an option");
        return option;
    }
}
