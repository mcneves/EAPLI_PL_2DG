/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;


/**
 *
 * @author Ricardo Rocha
 */
public interface IRepositoryFactory {
    IExpenseRepository getExpenseRepository();
    IExpenseTypeRepository getExpenseTypeRepository();
    IPaymentMeansRepository getPaymentMeansRepository();
    IIncomeTypeRepository getIncomeTypeRepository();
}
