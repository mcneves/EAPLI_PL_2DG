/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.Inmemory;

import Model.Income;
import Persistence.IIncomeRepository;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author José Nuno Loureiro
 */
public class IncomeRepository implements IIncomeRepository {

    private static List<Income> listIncome = new ArrayList<>();

    public IncomeRepository() {
    }

    @Override
    public void saveIncome(Income inc) {
        if (inc == null) {
            throw new IllegalArgumentException();
        }
        listIncome.add(inc);
    }

    @Override
    public List<Income> getAllIncomes() {
        return Collections.unmodifiableList(listIncome);

    }
}
