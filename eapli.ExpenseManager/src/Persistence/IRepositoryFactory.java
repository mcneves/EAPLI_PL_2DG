/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import Persistence.Inmemory.ExpenseRepository;
import Persistence.Inmemory.ExpenseTypeRepository;
import Persistence.Inmemory.PaymentMeansRepository;

/**
 *
 * @author Ricardo Rocha
 */
public interface IRepositoryFactory {
    ExpenseRepository getExpenseRepository();
    ExpenseTypeRepository getExpenseTypeRepository();
    PaymentMeansRepository getPaymentMeansRepository();
}
