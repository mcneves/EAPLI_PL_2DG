package Presentation;

import Controllers.BaseController;
import Controllers.ShowBalanceController;

/**
 *
 * @author Joao Pacheco
 */
public class ShowBalanceUI extends BaseUI{
    
    public ShowBalanceUI() {
    }
    
    ShowBalanceController controller = new ShowBalanceController();
    
    public void run(){
        
        System.out.println("* * * Show Balance * * *\n\n");
        System.out.println("Balance: "+controller.getBalance());
    }
    
    @Override
    public void header() {
        System.out.println("---Show Balance---");
    }

    @Override
    protected BaseController controller() {
        return controller;
    }
}
