/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;


import Model.IncomeType;
import Persistence.IncomeTypeRepository;
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
        IncomeTypeRepository repository = new IncomeTypeRepository();
        repository.saveIncomeTypes(incomeType);
    }
    
    public List<IncomeType> getAllIncomeType()
    {
        IncomeTypeRepository repository = new IncomeTypeRepository();
        return repository.getAllIncomeTypes();
    }
}
