package Controllers;

import Model.Cash;
import Model.Check;
import Model.CreditCard;
import Model.DebitCard;
import Model.Expense;
import Model.PaymentMean;
import Persistence.Inmemory.ExpenseRepository;
import Persistence.Inmemory.PaymentMeansRepository;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class PaymentMeanController {

    PaymentMeansRepository repo = new PaymentMeansRepository();
    
    public void registerCheck(String accountNumber, String checkNumber, String bank) {
        Check ch = new Check(accountNumber, checkNumber, bank);
        
        repo.savePaymentMean(ch);
    }

    public void registerCash() {
        Cash ca = new Cash();
        
        repo.savePaymentMean(ca);
    }

    public void registerCreditCard(String accountNumberCC, String CVC, String bankCC, Date validade) {
        CreditCard cc = new CreditCard(accountNumberCC, CVC, bankCC, validade);
        
        repo.savePaymentMean(cc);
    }

    public void registerDebitCard(String accountNumberDC, String bankDC, Date validadeDC) {
        DebitCard dc = new DebitCard(accountNumberDC, bankDC, validadeDC);
        
        repo.savePaymentMean(dc);
    }
    
    public List<PaymentMean> listAllPaymentMeans(){
        PaymentMeansRepository pmr = new  PaymentMeansRepository();
        List<PaymentMean> list = pmr.getAllPaymentMean();
        for(int i=0;i<list.size();i++){
            pmr.getAllPaymentMean();
        }
        return list;
    }
}
