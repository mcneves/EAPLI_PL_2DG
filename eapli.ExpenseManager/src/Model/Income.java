/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author José Nuno Loureiro
 */
public class Income {
    
    private String description;
    private BigDecimal amount;
    private Date dateOccurred;
    private IncomeType type;
    
    protected Income(){
    }
    
    public Income(String description, Date dateOccurred, BigDecimal amount, IncomeType type) {
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
        this.type=type;
    }
    
    @Override
    public String toString() {
        NumberFormat n = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        double doubleAmount = this.amount.doubleValue();
        String s = "Description: " + this.description
                + "\nAmount: " + n.format(doubleAmount)  
                +"\nDate: " + dateOccurred
                + "\n "+ type;
        return s;
    }

}
