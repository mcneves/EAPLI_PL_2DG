package Persistence;

import Model.PaymentMean;
import java.util.List;


public interface IPaymentMeansRepository {
    void savePaymentMean(PaymentMean pM);
    List<PaymentMean> getAllPaymentMean();
    
}
