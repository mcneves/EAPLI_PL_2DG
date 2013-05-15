package Controllers;

import Model.ExpenseRecord;
import Persistence.IExpenseRepository;
import Persistence.PersistenceFactory;

/**
 *
 * @author João Pacheco
 */
public class CalculateBalanceController {
    public CalculateBalanceController() {
      }
    
    public float calculateExpenseBalance(){
        float balance = 0;
        IExpenseRepository repo = PersistenceFactory.getInstance().buildRepositoryFactory().getExpenseRepository();     
        ExpenseRecord ER=new ExpenseRecord(repo.getAllExpenses());
        balance = ER.calculateExpensesBalance();
        return balance;
    }
}
