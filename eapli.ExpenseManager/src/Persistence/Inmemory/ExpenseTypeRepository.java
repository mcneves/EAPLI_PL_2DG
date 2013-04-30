/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.Inmemory;

import Model.ExpenseType;
import Persistence.IExpenseTypeRepository;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Ricardo Rocha
 */
public class ExpenseTypeRepository implements IExpenseTypeRepository{
    private static List<ExpenseType> listExpenseType = new ArrayList<>();
    public ExpenseTypeRepository(){}
    
    public void saveExpenseTypes(ExpenseType expType) {
        if (expType == null) {
            throw new IllegalArgumentException();
        }
        listExpenseType.add(expType);
    }
    public List<ExpenseType> getAllExpenseTypes() {
        return Collections.unmodifiableList(listExpenseType);
    }
    /*public ExpenseType getLastExpenseTypes(){
        ExpenseType expType=null;
        ExpenseType copy=null;
        int size=listExpenseType.size();
        if(size>0){
            expType=listExpenseType.get(size-1);
        }
        
        if(expType!=null){
            copy=new ExpenseType(expType);
        }
        
        return copy;
    }*/

    
}
