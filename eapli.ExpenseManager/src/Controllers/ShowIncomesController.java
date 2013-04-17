/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.Income;
import Persistence.IIncomeRepository;
import Persistence.IncomeRepository;
import java.util.List;

/**
 *
 * @author Outsider
 */
public class ShowIncomesController extends BaseController{
    public ShowIncomesController() {
      }

      public List<Income> getAllIncomes() {
            IIncomeRepository repo = Persistence.PersistenceRegistry.getInstance().incomeRepository();
            return repo.getAllIncomes();
      }

   }
