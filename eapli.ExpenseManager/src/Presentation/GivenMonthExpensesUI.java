/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.GivenMonthExpensesController;
import Model.Expense;
import Model.ExpenseType;
import Persistence.ExpenseTypeRepository;
import eapli.util.Console;
import java.util.List;

/**
 *
 * @author i110459
 */
public class GivenMonthExpensesUI {
    
//    public BaseController controller(){
//        return controller;
//    }
    
    public void header(){
       System.out.println("* * *  MONTHLY EXPENSES  * * *\n"); 
    }
    
    public void run() {   
        GivenMonthExpensesController  MEC=new GivenMonthExpensesController();
        List<Expense> listmonthly;
        String date=Console.readLine("Qual o mes pretendido?(mm-yyyy)");
        String f=Console.readLine("Deseja filtrar por tipo de despesa?(S/N)");
        if(f.matches("N")||f.matches("n")){
            listmonthly= MEC.getMonthlyExpenses(date);
        }
        else{
            ExpenseTypeRepository etr=new ExpenseTypeRepository();
            List<ExpenseType> eT=etr.getAllExpenseTypes();
            for(int i=0;i<eT.size();i++){
                System.out.println((i+1)+"-"+eT.get(i));
            }
            int t=Console.readInteger("Qual o tipo?");
            ExpenseType T=eT.get(t-1);
            listmonthly= MEC.getFMonthlyExpenses(T,date);
        }
        header();
            
        for(int i=0;i<listmonthly.size();i++)
        {
            System.out.println(listmonthly.get(i).toString());
        }     
    }
}
