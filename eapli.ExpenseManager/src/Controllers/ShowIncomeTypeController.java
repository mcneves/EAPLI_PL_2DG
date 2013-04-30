package Controllers;

import Model.IncomeType;
import Persistence.Inmemory.IncomeTypeRepository;
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
            IncomeTypeRepository repo = new IncomeTypeRepository();
            return repo.getAllIncomeTypes();
    }
}
