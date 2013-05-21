package Controllers;

import Model.AccountServices;

/**
 *
 * @author João Pacheco
 */
public class ShowBalanceController extends BaseController {
    public ShowBalanceController() {
      }
    
    public float getBalance(){
        float balance = 0; 
        AccountServices.getBalance();
        return balance;
    }
}
