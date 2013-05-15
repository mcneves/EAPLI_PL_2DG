/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.ExpenseType;
import Persistence.IExpenseTypeRepository;
import Persistence.Inmemory.ExpenseTypeRepository;
import Persistence.PersistenceFactory;
import java.util.List;

/**
 *
 * @author Ricardo Rocha
 */
public class ExpenseTypeRegisterController extends BaseController {
    public ExpenseTypeRegisterController(){}
    public void registerExpenseType(String description)
    {
        ExpenseType expenseType = new ExpenseType(description);
        IExpenseTypeRepository repository = PersistenceFactory.getInstance().buildRepositoryFactory().getExpenseTypeRepository();
        repository.saveExpenseTypes(expenseType);
    }
    
    public List<ExpenseType> getAllExpenseType()
    {
        ExpenseTypeRepository repository = new ExpenseTypeRepository();
        return repository.getAllExpenseTypes();
    }
}
