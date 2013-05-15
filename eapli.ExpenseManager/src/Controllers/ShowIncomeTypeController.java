package Controllers;

import Model.IncomeType;
import Persistence.IIncomeTypeRepository;
import Persistence.PersistenceFactory;
import java.util.List;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ricardo Rocha
 */
public class ShowIncomeTypeController {
    public ShowIncomeTypeController(){}
    public List<IncomeType> getAllIncomeTypes() {
            IIncomeTypeRepository repo = PersistenceFactory.getInstance().buildRepositoryFactory().getIncomeTypeRepository();      
            return repo.getAllIncomeTypes();
    }
}
