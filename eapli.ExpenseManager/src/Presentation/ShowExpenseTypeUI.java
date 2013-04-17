/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.ShowExpenseTypeController;
import Model.ExpenseType;
import eapli.util.Console;
import java.util.List;

/**
 *
 * @author Ricardo Rocha
 */
public class ShowExpenseTypeUI {
    
    public void run()
    {
        ShowExpenseTypeController controller = new ShowExpenseTypeController();
        List<ExpenseType> allExpenseTypes = controller.getAllExpenseTypes();
        int size = allExpenseTypes.size();
        for(int i=0;i<size;i++)
            System.out.println(allExpenseTypes.get(i).toString());
        Console.readLine("\nPress any key to continuous");
        
    }
}
