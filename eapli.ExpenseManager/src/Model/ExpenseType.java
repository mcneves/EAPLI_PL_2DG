/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.persistence.*;

/**
 *
 * @author Ricardo Rocha
 */
@Entity
public class ExpenseType {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String description;
    
    public ExpenseType(){}
  
    public ExpenseType(String description)
    {
        this.description = description;
    }
    public ExpenseType(ExpenseType expenseType)
    {
        this.description = expenseType.getdescription();
    }
    public String getdescription()
    {
        return description;
    }
    
    public String toString()
    {
        return "Type: " + description;
    }
}
