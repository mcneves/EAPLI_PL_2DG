package Persistence.Inmemory;

import Model.PaymentMean;
import Persistence.IPaymentMeansRepository;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PaymentMeansRepository implements IPaymentMeansRepository{
    
    private static List<PaymentMean> listPaymentMean = new ArrayList<PaymentMean>();
    
    public PaymentMeansRepository() {
        
    }

    public void savePaymentMean(PaymentMean pm) {
        if(pm==null) throw new IllegalArgumentException();
        listPaymentMean.add(pm);
    }
    
    public List<PaymentMean> getAllPaymentMean() {
        return Collections.unmodifiableList(listPaymentMean);
    }
    
   
}
