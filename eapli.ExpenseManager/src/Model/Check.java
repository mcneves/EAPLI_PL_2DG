package Model;

public class Check extends PaymentMean {
    
    private String accountNumber;
    private String checkNumber;
    private String bank;

    public Check(String accountNumber, String checkNumber, String bank) {
        super("Check");
        this.accountNumber = accountNumber;
        this.checkNumber = checkNumber;
        this.bank = bank;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
    
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCheckNumber() {
        return checkNumber;
    }

    public void setCheckNumber(String checkNumber) {
        this.checkNumber = checkNumber;
    }

    public String getBank() {
        return bank;
    }
}
