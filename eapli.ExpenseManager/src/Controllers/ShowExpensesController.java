/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.Expense;
import Persistence.Inmemory.ExpenseRepository;
import Persistence.*;
import java.util.List;

/**
 *
 * @author
 */
public class ShowExpensesController extends BaseController {

    public ShowExpensesController() {
    }

    public List<Expense> getAllExpenses() {
        IExpenseRepository repo = Persistence.PersistenceFactory.getInstance().buildRepositoryFactory().getExpenseRepository();
        return repo.getAllExpenses();
    }

    public Expense getLastExpense() {
        IExpenseRepository repo = Persistence.PersistenceFactory.getInstance().buildRepositoryFactory().getExpenseRepository();
        return repo.getLastExpense();
    }
}
