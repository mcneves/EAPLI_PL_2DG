package eapli;


import Model.ExpenseType;
import Persistence.Inmemory.ExpenseTypeRepository;
import Persistence.IExpenseTypeRepository;
import java.util.List;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ricardo Rocha
 */
public class ExpenseTypeBootStrapper {
    static{
        IExpenseTypeRepository repo = Persistence.PersistenceFactory.getInstance().buildRepositoryFactory().getExpenseTypeRepository();
        
        repo.saveExpenseTypes(new ExpenseType("Transportes"));
        repo.saveExpenseTypes(new ExpenseType("Vestuario"));
        repo.saveExpenseTypes(new ExpenseType("Refeições"));
        repo.saveExpenseTypes(new ExpenseType("Lazer"));
    }
}
