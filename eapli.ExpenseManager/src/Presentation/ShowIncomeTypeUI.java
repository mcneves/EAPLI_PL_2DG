/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.ShowIncomeTypeController;
import Model.IncomeType;
import eapli.util.Console;
import java.util.List;

/**
 *
 * @author Ricardo Rocha
 */
public class ShowIncomeTypeUI {
    public void run()
    {
        ShowIncomeTypeController controller = new ShowIncomeTypeController();
        List<IncomeType> allIncomeTypes = controller.getAllIncomeTypes();
        int size = allIncomeTypes.size();
        for(int i=0;i<size;i++)
            System.out.println(allIncomeTypes.get(i).toString());
        Console.readLine("\nPress any key to continuous");
        
    }
}
