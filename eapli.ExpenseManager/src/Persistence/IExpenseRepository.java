/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import Model.Expense;
import java.util.List;

/**
 *
 * @author i100623
 */
public interface IExpenseRepository {
    void saveExpense(Expense exp);
    List<Expense>getAllExpenses();
    Expense getLastExpense();  
}
