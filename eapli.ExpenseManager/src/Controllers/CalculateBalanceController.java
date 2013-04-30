package Controllers;

import Model.ExpenseRecord;
import Persistence.Inmemory.ExpenseRepository;

/**
 *
 * @author João Pacheco
 */
public class CalculateBalanceController {
    public CalculateBalanceController() {
      }
    
    public float calculateExpenseBalance(){
        float balance = 0;
        ExpenseRepository repo=new ExpenseRepository();
        ExpenseRecord ER=new ExpenseRecord(repo.getAllExpenses());
        balance = ER.calculateExpensesBalance();
        return balance;
    }
}
