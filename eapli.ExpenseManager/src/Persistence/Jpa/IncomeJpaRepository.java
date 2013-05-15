package Persistence.Jpa;

import Model.Income;
import Persistence.IIncomeRepository;
import java.util.List;

/**
 *
 * @author JoaoPacheco
 */
public class IncomeJpaRepository extends JpaGeneric<Income, Long> implements IIncomeRepository{

    @Override
    public void saveIncome(Income inc) {
        super.save(inc);
    }

    @Override
    public List<Income> getAllIncomes() {
        return super.all();
    }
    
}
