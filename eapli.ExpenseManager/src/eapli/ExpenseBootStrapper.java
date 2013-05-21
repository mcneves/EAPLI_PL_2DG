/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli;

import Model.Expense;
import Model.ExpenseType;
import Model.PaymentMean;
import Persistence.Inmemory.ExpenseRepository;
import Persistence.IExpenseRepository;
import Persistence.IExpenseTypeRepository;
import Persistence.IPaymentMeansRepository;
import java.math.BigDecimal;
import eapli.util.DateTime;

/**
 *
 * @author José Nuno Loureiro
 */
public class ExpenseBootStrapper {
    
    static{
        IExpenseRepository repo = Persistence.PersistenceFactory.getInstance().buildRepositoryFactory().getExpenseRepository();
        IPaymentMeansRepository repoPM = Persistence.PersistenceFactory.getInstance().buildRepositoryFactory().getPaymentMeansRepository();
        IExpenseTypeRepository repoET = Persistence.PersistenceFactory.getInstance().buildRepositoryFactory().getExpenseTypeRepository();
        
        
        ExpenseType etr = repoET.getAllExpenseTypes().get(0);
        PaymentMean pm = repoPM.getAllPaymentMean().get(0);
        ExpenseType etr1 = repoET.getAllExpenseTypes().get(2);
        PaymentMean pm1 = repoPM.getAllPaymentMean().get(1);
        ExpenseType etr2 = repoET.getAllExpenseTypes().get(1);
        PaymentMean pm2 = repoPM.getAllPaymentMean().get(2);
        
        repo.saveExpense(new Expense("Autocarro",DateTime.newDate(2013, 3, 4),new BigDecimal(2.4),pm,etr));
        repo.saveExpense(new Expense("Almoço",DateTime.newDate(2013, 3, 5),new BigDecimal(12.4),pm1,etr1));
        repo.saveExpense(new Expense("Sapatilhas",DateTime.newDate(2013, 3, 6),new BigDecimal(123.4),pm2,etr2));
    }
}
