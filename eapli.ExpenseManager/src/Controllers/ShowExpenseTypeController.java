/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.ExpenseType;
import Persistence.Inmemory.ExpenseTypeRepository;
import java.util.List;

/**
 *
 * @author Ricardo Rocha
 */
public class ShowExpenseTypeController extends BaseController{
    public ShowExpenseTypeController(){}
    public List<ExpenseType> getAllExpenseTypes() {
            ExpenseTypeRepository repo = new ExpenseTypeRepository();
            return repo.getAllExpenseTypes();
    }
    
}
