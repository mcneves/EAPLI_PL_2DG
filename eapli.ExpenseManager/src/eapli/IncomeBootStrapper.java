/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli;

import Model.Income;
import Model.IncomeType;
import Persistence.IIncomeRepository;
import Persistence.IIncomeTypeRepository;
import Persistence.PersistenceFactory;
import eapli.util.DateTime;
import java.math.BigDecimal;

/**
 *
 * @author Outsider
 */
public class IncomeBootStrapper {
    static{
        IIncomeRepository repo = Persistence.PersistenceFactory.getInstance().buildRepositoryFactory().getIncomeRepository();
        IIncomeTypeRepository repoIT = Persistence.PersistenceFactory.getInstance().buildRepositoryFactory().getIncomeTypeRepository();
        
        IncomeType it1 = repoIT.getAllIncomeTypes().get(0);
        IncomeType it2 = repoIT.getAllIncomeTypes().get(2);
        
        repo.saveIncome(new Income("Ordenado Março",DateTime.newDate(2013,03,10),new BigDecimal(500.0), it1));
        repo.saveIncome(new Income("Empresa xpto",DateTime.newDate(2013,03,10),new BigDecimal(300.0), it2));
        
    }
}
