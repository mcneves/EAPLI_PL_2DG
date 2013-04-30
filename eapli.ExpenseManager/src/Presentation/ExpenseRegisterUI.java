/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.BaseController;
import Controllers.CalculateBalanceController;
import eapli.util.Console;
import java.math.BigDecimal;
import java.util.Date;
import Controllers.ExpenseRegisterController;
import Controllers.PaymentMeanController;
import Model.ExpenseType;
import Model.PaymentMean;
import Persistence.ExpenseTypeRepository;
import eapli.util.DateTime;
//import Model.PaymentMeans; //quando existir
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author
 */
public class ExpenseRegisterUI extends BaseUI {

    public ExpenseRegisterUI() {
    }

            ExpenseRegisterController controller = new ExpenseRegisterController();

    public void run() {

        System.out.println("* * *  REGISTER AN EXPENSE  * * *\n");
        String desc = Console.readLine("Description:\n");

        Date date = Console.readDate("Date (dd-mm-yyyy): ");

        double value = Console.readDouble("Amount:\n"); //valor da despesa
        BigDecimal amount = new BigDecimal(value);

        displayListPaymentMeans(controller.getPaymentMeans()); // Listar meios de pagamento
        int ppm = Console.readInteger("Select a payment mean:\n");
        PaymentMean mean = controller.getPaymentMeans().get(ppm-1);
        
        //String comment = Console.readLine("Comment\n"); //Comentário da despesa

        displayListExpenseType(controller.getExpenseTypes()); //listar os tipos de despesa

        int pet = Console.readInteger("Select an expense type:\n");
        ExpenseType type = controller.getExpenseTypes().get(pet - 1);
       
        controller.registerExpense(desc, date, amount, mean, type); //regista a despesa

        CalculateBalanceController calculate = new CalculateBalanceController();
        System.out.println("Current balance: " + calculate.calculateExpenseBalance());


        System.out.println("Expense recorded. \n");
    }

    //Mostra as ExpenseTypes
    private void displayListExpenseType(List<ExpenseType> list) {
        int i = 0;
        System.out.println("List of Expense Types \n");
        for (ExpenseType type : list) {
            i = i + 1;
            System.out.println(i + " --> " + type);
        }
    }
    
    private void displayListPaymentMeans(List<PaymentMean> list) {
        int i = 0;
        System.out.println("List of Payment Means \n");
        for (PaymentMean mean : list) {
            i = i + 1;
            System.out.println(i + " --> " + mean);
        }
    }

//      private void displayListPaymentMeans(List<PaymentMeans> list) {
//            int i=0;
//            System.out.println("List of Payment Means \n");
//            for (PaymentMeans paymentmeans : list) {
//                  i=i+1;
//                  System.out.println("Payment Means "+i+"\n" + paymentmeans);
//            }
//      }
    @Override
    public void header() {
        System.out.println("---REGISTER AN EXPENSE---");
    }

    @Override
    protected BaseController controller() {
        return controller;
    }
}

