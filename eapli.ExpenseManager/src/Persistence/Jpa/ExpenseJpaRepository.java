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
        save(exp);
      }

      @Override
      public List<Expense> getAllExpenses() {
          return (List<Expense>)findAll();
      }

      @Override
      public Expense getLastExpense() {
          Long id = getCount();
          return read(id);
      }
      
}
