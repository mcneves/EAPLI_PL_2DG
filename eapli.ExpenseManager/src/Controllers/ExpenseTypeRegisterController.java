/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.ExpenseType;
import Persistence.ExpenseTypeRepository;
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
        ExpenseTypeRepository repository = new ExpenseTypeRepository();
        repository.saveExpenseTypes(expenseType);
    }
    
    public List<ExpenseType> getAllExpenseType()
    {
        ExpenseTypeRepository repository = new ExpenseTypeRepository();
        return repository.getAllExpenseTypes();
    }
}
