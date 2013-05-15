/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;


import Model.IncomeType;
import Persistence.IIncomeTypeRepository;
import Persistence.PersistenceFactory;
import java.util.List;

/**
 *
 * @author Nuno
 */
public class IncomeTypeRegisterController extends BaseController{
    public IncomeTypeRegisterController(){}
    public void registerIncomeType(String description)
    {
        IncomeType incomeType = new IncomeType(description);
        IIncomeTypeRepository repository = PersistenceFactory.getInstance().buildRepositoryFactory().getIncomeTypeRepository();
        repository.saveIncomeTypes(incomeType);
    }
    
    public List<IncomeType> getAllIncomeType()
    {
        IIncomeTypeRepository repository = PersistenceFactory.getInstance().buildRepositoryFactory().getIncomeTypeRepository();          
        return repository.getAllIncomeTypes();
    }
}
