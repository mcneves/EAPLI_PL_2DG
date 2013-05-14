/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.Jpa;

import Model.Expense;
import Persistence.IExpenseRepository;
import java.util.List;

/**
 *
 * @author mcn
 */
public class ExpenseJpaRepository  extends JpaGeneric<Expense,Long> implements IExpenseRepository{

      @Override
      public void saveExpense(Expense exp) {
            throw new UnsupportedOperationException("Not supported yet.");
      }

      @Override
      public List<Expense> getAllExpenses() {
            throw new UnsupportedOperationException("Not supported yet.");
      }

      @Override
      public Expense getLastExpense() {
            throw new UnsupportedOperationException("Not supported yet.");
      }
      
}
