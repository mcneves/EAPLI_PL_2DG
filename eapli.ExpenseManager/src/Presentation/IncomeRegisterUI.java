/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.BaseController;
import Controllers.CalculateBalanceController;
import Controllers.IncomeRegisterController;
import Model.IncomeType;
import eapli.util.Console;
import eapli.util.DateTime;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Outsider
 */
public class IncomeRegisterUI extends BaseUI {

    public IncomeRegisterUI() {
    }
    IncomeRegisterController controller = new IncomeRegisterController();

    public void run() {

        System.out.println("* * *  REGISTER AN INCOME  * * *\n");
        String desc = Console.readLine("Description:\n");
//        int year = Console.readInteger("Year:\n");
//        int month = Console.readInteger("Month (1-12):\n");
//        int day = Console.readInteger("Day:\n");

        Date date = Console.readDate("Date (dd-mm-yyyy): ");

        
        double value = Console.readDouble("Amount:\n"); //valor do rendimento
        BigDecimal amount = new BigDecimal(value);

        displayListIncomeType(controller.getIncomeTypes()); //listar os tipos de rendimento

        int position = Console.readInteger("Select an income type:\n");
        IncomeType type = controller.getIncomeTypes().get(position - 1);

        controller.registerIncome(desc, date, amount, type); //regista o rendimento

        CalculateBalanceController calculate = new CalculateBalanceController();
        System.out.println("Current balance: " + calculate.calculateExpenseBalance());


        System.out.println("Income recorded. \n");
    }

    //Mostra as ExpenseTypes
    private void displayListIncomeType(List<IncomeType> list) {
        int i = 0;
        System.out.println("List of Income Types \n");
        for (IncomeType type : list) {
            i = i + 1;
            System.out.println(i + " --> " + type);
        }
    }

    @Override
    public void header() {
        System.out.println("---REGISTER AN INCOME---");
    }

    @Override
    protected BaseController controller() {
        return controller;
    }
}
