package Model;

import Persistence.IExpenseRepository;
import Persistence.IIncomeRepository;
import Persistence.PersistenceFactory;
import java.math.BigDecimal;

/**
 *
 * @author João Pacheco
 */
public class AccountServices{
    
    public static BigDecimal getBalance(){
        
        IExpenseRepository repoEx = PersistenceFactory.getInstance().buildRepositoryFactory().getExpenseRepository();
        IIncomeRepository repoInc = PersistenceFactory.getInstance().buildRepositoryFactory().getIncomeRepository();
        
        BigDecimal expenses = new BigDecimal(0);
        BigDecimal incomes = new BigDecimal(0);
        
        for(int i=0; i< repoEx.getAllExpenses().size(); i++)
            expenses = new BigDecimal(expenses.doubleValue() + repoEx.getAllExpenses().get(i).getAmount().doubleValue());
        
        for(int j=0; j< repoInc.getAllIncomes().size(); j++)
            incomes = new BigDecimal(incomes.doubleValue() + repoInc.getAllIncomes().get(j).getAmount().doubleValue());
        
        return new BigDecimal(incomes.doubleValue() - expenses.doubleValue());
    }
}
