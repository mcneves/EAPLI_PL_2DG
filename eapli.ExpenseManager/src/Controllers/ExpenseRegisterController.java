/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.Expense;
import Model.ExpenseRecord;
import Model.ExpenseType;
import Model.PaymentMean;
import Persistence.Inmemory.ExpenseRepository;
import Persistence.Inmemory.ExpenseTypeRepository;
import Persistence.IExpenseRepository;
import Persistence.IExpenseTypeRepository;
import Persistence.IPaymentMeansRepository;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Jose Nuno Loureiro
 */
public class ExpenseRegisterController extends BaseController {

    public ExpenseRegisterController() {
    }

    public void registerExpense(String desc, Date date, BigDecimal amount, ExpenseType type) {
        Expense expense = new Expense(desc, date, amount, type);
        IExpenseRepository controller = Persistence.PersistenceFactory.getInstance().buildRepositoryFactory().getExpenseRepository();
        controller.saveExpense(expense);
    }

    public void registerExpense(String desc, Date date, BigDecimal amount, PaymentMean mean, ExpenseType type) {
        Expense expense = new Expense(desc, date, amount, mean, type);
        IExpenseRepository controller = Persistence.PersistenceFactory.getInstance().buildRepositoryFactory().getExpenseRepository();
        controller.saveExpense(expense);
    }

    public List<ExpenseType> getExpenseTypes() {
        IExpenseTypeRepository etr = Persistence.PersistenceFactory.getInstance().buildRepositoryFactory().getExpenseTypeRepository();
        return etr.getAllExpenseTypes();
    }

    public List<PaymentMean> getPaymentMeans() {
        IPaymentMeansRepository pmr = Persistence.PersistenceFactory.getInstance().buildRepositoryFactory().getPaymentMeansRepository();
        return pmr.getAllPaymentMean();
    }
}
