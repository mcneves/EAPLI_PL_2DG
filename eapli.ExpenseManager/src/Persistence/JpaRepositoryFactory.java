/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

<<<<<<< HEAD
import Persistence.Jpa.IncomeTypeJpaRepository;
=======
import Persistence.Inmemory.ExpenseTypeRepository;
import Persistence.Jpa.ExpenseJpaRepository;
>>>>>>> 048a2d4d02c5563d5be0b80ddd21bc1e4839cbfb

/**
 *
 * @author Ricardo Rocha
 */
public class JpaRepositoryFactory implements IRepositoryFactory{

    @Override
    public IExpenseRepository getExpenseRepository() {
           return new ExpenseJpaRepository();
    }

    @Override
    public IExpenseTypeRepository getExpenseTypeRepository() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public IPaymentMeansRepository getPaymentMeansRepository() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public IIncomeTypeRepository getIncomeTypeRepository() {
        return new IncomeTypeJpaRepository();
    }
    
}
