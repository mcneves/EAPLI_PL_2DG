/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.Jpa;

import Model.ExpenseType;
import java.util.List;
import Persistence.IExpenseTypeRepository;

/**
 *
 * @author simaotiago
 */
public class ExpenseTypeJpaRepository extends JpaGeneric<ExpenseType, Long> implements IExpenseTypeRepository{
    
    @Override
    public void saveExpenseTypes(ExpenseType expT){
        super.save(expT);
    }
    
    @Override
    public List<ExpenseType> getAllExpenseTypes(){
        return super.all();
    }
    
}
