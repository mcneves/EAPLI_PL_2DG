/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Nuno
 */
public class IncomeType {
    private String description;
    
    public IncomeType(){}
  
    public IncomeType(String description)
    {
        this.description = description;
    }
    public IncomeType(IncomeType incomeType)
    {
        this.description = incomeType.getdescription();
    }
    public String getdescription()
    {
        return description;
    }
    
    public String toString()
    {
        return "Description: " + description;
    }
}
