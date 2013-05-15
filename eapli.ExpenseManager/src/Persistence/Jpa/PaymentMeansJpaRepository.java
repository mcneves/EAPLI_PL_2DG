/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.Jpa;

import Model.PaymentMean;
import Persistence.IPaymentMeansRepository;
import java.util.List;
import javax.persistence.EntityManager;


/**
 *
 * @author i100623
 */
public class PaymentMeansJpaRepository extends JpaGeneric<PaymentMean, Integer> implements IPaymentMeansRepository {

    @Override
    public void savePaymentMean(PaymentMean pM) {
        super.save(pM);
    }

    @Override
    public List<PaymentMean> getAllPaymentMean() {
        return super.all();
    }

}
