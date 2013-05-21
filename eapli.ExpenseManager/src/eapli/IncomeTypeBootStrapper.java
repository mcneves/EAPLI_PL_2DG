/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli;

import Model.IncomeType;
import Persistence.IIncomeTypeRepository;
import Persistence.PersistenceFactory;

/**
 *
 * @author Nuno
 */
public class IncomeTypeBootStrapper {
        static{
        IIncomeTypeRepository repo = Persistence.PersistenceFactory.getInstance().buildRepositoryFactory().getIncomeTypeRepository();
        
        repo.saveIncomeTypes(new IncomeType("Salário"));
        repo.saveIncomeTypes(new IncomeType("Mesada"));
        repo.saveIncomeTypes(new IncomeType("Prestação de Serviços"));
    }
}
