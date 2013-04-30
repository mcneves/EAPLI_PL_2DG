/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.Expense;
import Persistence.Inmemory.ExpenseRepository;
import java.util.List;

/**
 *
 * @author Nuno
 */
public class ExpenseListController {
    
    public ExpenseListController(){
        
    }
    
    public List<Expense>getAllExpenses(){
        ExpenseRepository repo = new ExpenseRepository();
        return repo.getAllExpenses();
    }
}
