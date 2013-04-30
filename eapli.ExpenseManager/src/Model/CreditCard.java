package Model;

import java.util.Date;


public class CreditCard extends PaymentMean {
    
    private String accountNumber;
    private String cvc;
    private String bank;
    private Date expirationValue;

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
