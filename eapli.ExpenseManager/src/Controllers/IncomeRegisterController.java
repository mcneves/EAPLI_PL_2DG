/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.Income;
import Model.IncomeType;
import Persistence.IIncomeRepository;
import Persistence.IIncomeTypeRepository;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 *
 * @author José Nuno Loureiro
 */
public class IncomeRegisterController extends BaseController{
     public IncomeRegisterController() {
      }

      public void registerIncome(String desc, Date date, BigDecimal amount, IncomeType type) {
            Income income = new Income(desc, date, amount, type);
            IIncomeRepository controller= Persistence.PersistenceFactory.getInstance().buildRepositoryFactory().getIncomeRepository();
            controller.saveIncome(income);
      }
      
    public List<IncomeType> getIncomeTypes() {
        IIncomeTypeRepository itr = Persistence.PersistenceFactory.getInstance().buildRepositoryFactory().getIncomeTypeRepository();
        return itr.getAllIncomeTypes();
    }
    
}
