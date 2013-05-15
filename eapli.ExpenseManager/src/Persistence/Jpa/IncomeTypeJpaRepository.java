/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.Jpa;

import Model.IncomeType;
import Persistence.IIncomeTypeRepository;
import java.util.List;

/**
 *
 * @author BrunoCostaISEP
 */
public class IncomeTypeJpaRepository extends JpaGeneric<IncomeType, Long> implements IIncomeTypeRepository{

    @Override
    public void saveIncomeTypes(IncomeType incomeType) {
        super.save(incomeType);
    }

    @Override
    public List<IncomeType> getAllIncomeTypes() {
        return super.all();
    }
    
}
