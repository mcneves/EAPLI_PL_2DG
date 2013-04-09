/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import eapli.util.Console;
import java.math.BigDecimal;
import java.util.Date;
import Controllers.ExpenseRegisterController;
import Model.ExpenseType;
//import Model.PaymentMeans; //quando existir
import java.util.Calendar;
import java.util.List;
/**
 *
 * @author 
 */
public class ExpenseRegisterUI {
      public ExpenseRegisterUI() {
      }
      
      public void run() {
            System.out.println("* * *  REGISTER AN EXPENSE  * * *\n");
            String desc = Console.readLine("Description:\n");
            ExpenseType expensetype = new ExpenseType("CC");
           // PaymentMeans paymentmeans = new PaymentMeans("null"); //objecto do tipo Payment Means
            Calendar date = Calendar.getInstance(); // Date do tipo Calendar?
           // Date date = Console.readDate("When (dd-MM-yyyy):"); ANTIGA DATA
            double value = Console.readDouble("Amount:\n");
            BigDecimal amount = new BigDecimal(value);
            String comment = Console.readLine("Comment\n"); //Comentário da despesa

            ExpenseRegisterController controller = new ExpenseRegisterController();
            controller.registerExpense(desc, date, amount);
            
            displayListExpenseType(controller.getExpenseTypes());
            //controller.getPayentMeans();

            System.out.println("Expense recorded. \n");
      }
      
      //Mostra as ExpenseTypes
      private void displayListExpenseType(List<ExpenseType> list) {
            int i=0;
            System.out.println("List of Expense Types \n");
            for (ExpenseType type : list) {
                  i=i+1;
                  System.out.println("Expense Type "+i+"\n" + type);
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
}