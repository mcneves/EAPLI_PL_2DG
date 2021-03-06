
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
import Model.PaymentMean; //quando existir
import javax.persistence.*;

/**
 *
 * @author Jose Nuno Loureiro
 */
@Entity
public class Expense {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private BigDecimal amount;
    @ManyToOne(cascade = CascadeType.ALL)
    private PaymentMean paymentMean;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateOccurred;
    @ManyToOne(cascade = CascadeType.ALL)
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
        this.dateOccurred = dateOccurred;
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
        this.type = exp.type;
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
        this.dateOccurred = dateOccurred;
        this.type = type;
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
        this.type = type;
    }
    
    @Override
    public String toString() {
        NumberFormat n = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        double doubleAmount = this.amount.doubleValue();
        String s = "Description: " + this.description
                + "\nAmount: " + n.format(doubleAmount)
                + "\n" + paymentMean
                + "\nDate: " + dateOccurred
                + "\n" + type;
        return s;
        
    }
    
    public Date getDateOcurred() {
        return dateOccurred;
    }

    public BigDecimal getAmount() {
        return amount;
    }
    
    public int getMonth() {
        Calendar c = DateTime.dateToCalendar(dateOccurred);
        //c.setTime(dateOccurred);
        return c.get(Calendar.MONTH);        
    }
    
    public int getYear() {
        Calendar c = DateTime.dateToCalendar(dateOccurred);
        //c.setTime(dateOccurred);
        if(c.get(Calendar.YEAR)<1000)
            return c.get(Calendar.YEAR);
        else{
            return c.get(Calendar.YEAR)-1900;
        }
    }
    
    public ExpenseType getExpenseType() {
        return type;
    }
}
