/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.Inmemory;

import Model.IncomeType;
import Persistence.IIncomeTypeRepository;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Nuno
 */
public class IncomeTypeRepository implements IIncomeTypeRepository {
    private static List<IncomeType> listIncomeType = new ArrayList<>();
    public IncomeTypeRepository(){}
    
    public void saveIncomeTypes(IncomeType incomeType) {
        if (incomeType == null) {
            throw new IllegalArgumentException();
        }
        listIncomeType.add(incomeType);
    }
    public List<IncomeType> getAllIncomeTypes() {
        return Collections.unmodifiableList(listIncomeType);
    }
}
