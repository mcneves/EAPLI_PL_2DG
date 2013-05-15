package Model;

import java.util.Date;
import javax.persistence.*;

@Entity
public class DebitCard extends PaymentMean {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
       
    private String accountNumber;
    private String bank;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date date;

    protected DebitCard(){}
    
    public DebitCard(String accountNumberDC, String bankDC, Date validadeDC) {
        super("Debit card");
        this.accountNumber = accountNumberDC;
        this.bank = bankDC;
        this.date = validadeDC;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getBank() {
        return bank;
    }
    
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    public String toString(){
        return super.toString()+"\nAccount Number: "+accountNumber+"\nBank: "+bank+"\nExpiration Value: "+date;
    }
}
