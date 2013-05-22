package Controllers;

import Model.AccountServices;
import java.math.BigDecimal;

/**
 *
 * @author João Pacheco
 */
public class ShowBalanceController extends BaseController {
    public ShowBalanceController() {
      }
    
    public BigDecimal getBalance(){
        return new BigDecimal(AccountServices.getBalance().floatValue());
    }
}
