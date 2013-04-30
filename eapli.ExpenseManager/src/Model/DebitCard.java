package Model;

import java.util.Date;

public class DebitCard extends PaymentMean {

    private String accountNumber;
    private String bank;
    private Date date;

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
}
