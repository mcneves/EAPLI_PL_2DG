package eapli;

import Model.Cash;
import Model.Check;
import Model.CreditCard;
import Model.DebitCard;
import Persistence.IPaymentMeansRepository;
import Persistence.Inmemory.PaymentMeansRepository;
import java.util.Date;


public class PaymentMeansBootStrapper {
   
    static{
        IPaymentMeansRepository repo = new PaymentMeansRepository();
        Cash c = new Cash();
        Check ch = new Check("1237648756435673", "78", "BPI");
        Date d= new Date(2013-05-12);
        CreditCard cc= new CreditCard("7685968675534231", "256", "BPN", d);
        DebitCard dc = new DebitCard("7865456789876543", "Mileniun", d);
        
        repo.savePaymentMean(c);
        repo.savePaymentMean(ch);
        repo.savePaymentMean(cc);
        repo.savePaymentMean(dc);
        
    }


}
