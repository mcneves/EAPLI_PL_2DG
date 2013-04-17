/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;


import Controllers.BaseController;
import Controllers.IncomeTypeRegisterController;
import Model.IncomeType;
import eapli.util.Console;
import java.util.List;

/**
 *
 * @author Nuno
 */
public class IncomeTypeRegisterUI extends BaseUI {
          private IncomeTypeRegisterController controller = new IncomeTypeRegisterController();
      public IncomeTypeRegisterUI() {
      }

      @Override
      public void run() {

            List<IncomeType> listIncomeType = controller.getAllIncomeType();
          
            System.out.println("\n* * * ALL INCOMETYPES * * *");
            for (int i = 0; i < listIncomeType.size(); i++) {
                System.out.println(listIncomeType.get(i).getdescription());
            }
            
            String type = Console.readLine("\nRegister income type please:");
            controller.registerIncomeType(type);

            System.out.println("Income type recorded.");
      }
      @Override
    protected BaseController controller() {
        return controller;
    }

    @Override
    public void header() {
        System.out.println("---INCOME TYPES---");
    }
}
