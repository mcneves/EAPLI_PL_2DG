/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.ExpenseType;
import Persistence.IExpenseTypeRepository;
import java.util.List;

/**
 *
 * @author Ricardo Rocha
 */
public class ShowExpenseTypeController extends BaseController{
    public ShowExpenseTypeController(){}
    public List<ExpenseType> getAllExpenseTypes() {
            IExpenseTypeRepository repo = Persistence.PersistenceFactory.getInstance().buildRepositoryFactory().getExpenseTypeRepository();
            return repo.getAllExpenseTypes();
    }
    
}
