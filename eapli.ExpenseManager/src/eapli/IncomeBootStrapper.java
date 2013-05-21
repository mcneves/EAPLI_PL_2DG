/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli;

import Model.Income;
import Model.IncomeType;
import Persistence.IIncomeRepository;
import Persistence.PersistenceFactory;
import eapli.util.DateTime;
import java.math.BigDecimal;

/**
 *
 * @author Outsider
 */
public class IncomeBootStrapper {
    static{
        IIncomeRepository repo = PersistenceFactory.getInstance().buildRepositoryFactory().getIncomeRepository();
        
        repo.saveIncome(new Income("Ordenado Março",DateTime.newDate(2013,03,10),new BigDecimal(500.0), new IncomeType("Salário")));
        repo.saveIncome(new Income("Empresa xpto",DateTime.newDate(2013,03,10),new BigDecimal(300.0), new IncomeType("Prestação de Serviços")));
        
    }
}
