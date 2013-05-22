/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.BaseController;
import Controllers.GivenMonthExpensesController;
import Model.Expense;
import Model.ExpenseType;
import Persistence.IExpenseTypeRepository;
import eapli.util.Console;
import java.util.List;

/**
 *
 * @author i110459
 */
public class GivenMonthExpensesUI extends BaseUI{
    
    GivenMonthExpensesController  controller=new GivenMonthExpensesController();
    
    public BaseController controller(){
        return controller;
    }
    
    public void header(){
       System.out.println("* * *  MONTHLY EXPENSES  * * *\n"); 
    }
    
    public void run() {   
        
        List<Expense> listmonthly;
        String date=Console.readLine("Qual o mes pretendido?(mm-yyyy)");
        String f=Console.readLine("Deseja filtrar por tipo de despesa?(S/N)");
        if(f.matches("N")||f.matches("n")){
            listmonthly= controller.getMonthlyExpensesList(date);
        }
        else{
            IExpenseTypeRepository etr=Persistence.PersistenceFactory.getInstance().buildRepositoryFactory().getExpenseTypeRepository();
            List<ExpenseType> eT=etr.getAllExpenseTypes();
            for(int i=0;i<eT.size();i++){
                System.out.println((i+1)+"-"+eT.get(i));
            }
            int t=Console.readInteger("Qual o tipo?");
            ExpenseType T=eT.get(t-1);
            listmonthly= controller.getFMonthlyExpensesList(T,date);
        }
        header();
            
        for(int i=0;i<listmonthly.size();i++)
        {
            System.out.println(listmonthly.get(i).toString());
        }     
    }
}

