
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import eapli.util.DateTime;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import Model.ExpenseType;
//import Model.PaymentMeans; //quando existir

/**
 *
 * @author Jose Nuno Loureiro
 */
public class Expense {

    private String description;
    private BigDecimal amount;
    private PaymentMean paymentMean;
    private Date dateOccurred;
    private ExpenseType type;
    

    protected Expense() {
    }

    public Expense(String description, Date dateOccurred, BigDecimal amount) {
        if (description == null || dateOccurred == null || amount == null) {
            throw new IllegalArgumentException();
        }
        // cannot record a negative expense or a zero EUR expense
        if (amount.signum() == -1 || amount.signum() == 0) {
            throw new IllegalArgumentException();
        }
        this.description = description;
        this.amount = amount;
    }

//antiga data calendar
    public Expense(String desc, int year, int month, int day, BigDecimal amount) {
        this(desc, DateTime.newDate(year, month, day), amount);
    }

    public Expense(Expense exp) {
        if (exp == null) {
            throw new IllegalArgumentException();
        }
        this.description = exp.description;
        this.amount = exp.amount;
        this.paymentMean = exp.paymentMean;
        this.dateOccurred = exp.dateOccurred;
        this.type=exp.type;
    }

   

    public Expense(String description, Date dateOccurred, BigDecimal amount, ExpenseType type) {
        if (description == null || dateOccurred == null || amount == null) {
            throw new IllegalArgumentException();
        }
        // cannot record a negative expense or a zero EUR expense
        if (amount.signum() == -1 || amount.signum() == 0) {
            throw new IllegalArgumentException();
        }
        this.description = description;
        this.amount = amount;
        this.dateOccurred =dateOccurred;
        this.type=type;
    }
    
    
    
    public Expense(String description, Date dateOccurred, BigDecimal amount, PaymentMean paymentMean, ExpenseType type) {
        if (description == null || dateOccurred == null || amount == null) {
            throw new IllegalArgumentException();
        }
        // cannot record a negative expense or a zero EUR expense
        if (amount.signum() == -1 || amount.signum() == 0) {
            throw new IllegalArgumentException();
        }
        this.description = description;
        this.amount = amount;
        this.paymentMean = paymentMean;
        this.dateOccurred = dateOccurred;
        this.type=type;
    }
    
    @Override
    public String toString() {
        NumberFormat n = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        double doubleAmount = this.amount.doubleValue();
        String s = "Description: " + this.description
                + "\nAmount: " + n.format(doubleAmount)  
                + "\n" + paymentMean
                +"\nDate: " + dateOccurred
                + "\n "+ type;
        return s;

    }

    public Date getDateOcurred(){
        return dateOccurred;
    }
    public BigDecimal getAmount(){
        return amount;
    }
    
public int getMonth(){
        Calendar c=null;
        c.setTime(dateOccurred);
        return c.get(Calendar.MONTH); 
    }

    public int getYear(){
        Calendar c=null;
        c.setTime(dateOccurred);
       return c.get(Calendar.YEAR);
    }
    
    public ExpenseType getExpenseType(){
        return type;
    }
}
