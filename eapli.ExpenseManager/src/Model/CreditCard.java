package Model;

import java.util.Date;
import javax.persistence.*;

@Entity
public class CreditCard extends PaymentMean {
    
       @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String accountNumber;
    private String cvc;
    private String bank;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date expirationValue;
    
    protected CreditCard(){}

    public CreditCard(String accountNumberCC, String CVC, String bankCC, Date validade) {
        super("Credit Card");
        this.accountNumber = accountNumberCC;
        this.cvc = CVC;
        this.bank = bankCC;
        this.expirationValue = validade;
    }
    
    public String getAccountNumber(){
        return accountNumber;
    }
    
     public String getCvc(){
        return cvc;
    }
     
     public String getBank(){
        return bank;
    }
}
