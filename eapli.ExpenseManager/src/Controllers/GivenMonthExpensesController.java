/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.Expense;
import Model.ExpenseRecord;
import Model.ExpenseType;
import Persistence.IExpenseRepository;
import Persistence.Inmemory.ExpenseRepository;
import java.util.List;

/**
 *
 * @author i110459
 */
public class GivenMonthExpensesController extends BaseController{
    
    public List<Expense> getMonthlyExpensesList(String date){
        IExpenseRepository repo=Persistence.PersistenceFactory.getInstance().buildRepositoryFactory().getExpenseRepository();
        ExpenseRecord ER=new ExpenseRecord(repo.getAllExpenses());
        return ER.getMonthlyExpensesList(date);
    }
    
    public List<Expense> getFMonthlyExpensesList(ExpenseType type,String date){
        IExpenseRepository repo=Persistence.PersistenceFactory.getInstance().buildRepositoryFactory().getExpenseRepository();
        ExpenseRecord ER=new ExpenseRecord(repo.getAllExpenses());
        return ER.getFMonthlyExpensesList(type,date);
    }
    
    
}

