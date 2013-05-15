/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import Persistence.Jpa.IncomeTypeJpaRepository;
import Persistence.Inmemory.ExpenseTypeRepository;
import Persistence.Jpa.ExpenseJpaRepository;
import Persistence.Jpa.IncomeJpaRepository;

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

    @Override
    public IIncomeRepository getIncomeRepository() {
        return new IncomeJpaRepository();
    }
    
}
