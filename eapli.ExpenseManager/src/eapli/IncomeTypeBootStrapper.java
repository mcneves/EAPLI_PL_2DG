/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli;

import Model.IncomeType;
import Persistence.IIncomeTypeRepository;
import Persistence.Inmemory.IncomeTypeRepository;

/**
 *
 * @author Nuno
 */
public class IncomeTypeBootStrapper {
        static{
        IIncomeTypeRepository repo = new IncomeTypeRepository();
        
        repo.saveIncomeTypes(new IncomeType("Salário"));
        repo.saveIncomeTypes(new IncomeType("Mesada"));
        repo.saveIncomeTypes(new IncomeType("Prestação de Serviços"));
    }
}
