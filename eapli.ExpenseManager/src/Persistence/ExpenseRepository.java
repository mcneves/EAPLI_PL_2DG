<<<<<<< HEAD
package Persistence;

import Model.Expense;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author i100623
 */
public class ExpenseRepository implements IExpenseRepository{

    //class member
    private static List<Expense> listExpense = new ArrayList<Expense>();

    public ExpenseRepository() {
    }

    public void saveExpense(Expense exp) {
        if (exp == null) {
            throw new IllegalArgumentException();
        }
        listExpense.add(exp);
    }

    @Override
    public List<Expense> getAllExpenses() {
        return Collections.unmodifiableList(listExpense);
        
    }

    @Override
    public Expense getLastExpense() {
        Expense exp=null;
        Expense copy = null;
        int size=listExpense.size();
        if(size>0){ 
            exp=listExpense.get(size-1);
        }
        if(exp!=null){
            copy=new Expense(exp);
        }
        return copy;
    }
}
=======
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import Model.Expense;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Jose Nuno Loureiro
 */
public class ExpenseRepository implements IExpenseRepository {
    // class member

    private static List<Expense> listExpense = new ArrayList<>();

    public ExpenseRepository() {
    }
//Coment?rio awesome
    @Override
    public void saveExpense(Expense exp) {
        if (exp == null) {
            throw new IllegalArgumentException();
        }
        listExpense.add(exp);
    }

    @Override
    public List<Expense> getAllExpenses() {
        return Collections.unmodifiableList(listExpense);
    }

    @Override
    public Expense getLastExpense(){
        Expense exp=null;
        Expense copy=null;
        int size=listExpense.size();
        if(size>0){
            exp=listExpense.get(size-1);
        }
        
        if(exp!=null){
            copy=new Expense(exp);
        }
        
        return copy;
    }
    
}
>>>>>>> 5e6d348eb1b7d3c2884710a1d3659b80ff3f5394
