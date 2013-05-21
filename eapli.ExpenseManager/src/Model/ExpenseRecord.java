/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Persistence.Inmemory.ExpenseRepository;
import eapli.util.DateTime;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 *
 * @author i110459
 */
public class ExpenseRecord {

    private List<Expense> allExpenses;

    public ExpenseRecord(List<Expense> all) {
        allExpenses = all;
    }

    public List<Expense> getMonthlyExpensesList(String month) {
        BigDecimal total = new BigDecimal(0);
        String[] aux = month.split("-");
        int[] auxM = new int[2];
        List<Expense> despesas = allExpenses;
        List<Expense> despmes = null;
        for (int i = 0; i < despesas.size(); i++) {
            auxM[0] = despesas.get(i).getMonth();
            auxM[1] = despesas.get(i).getYear();
            if ((Integer.parseInt(aux[0])) == auxM[0] && (Integer.parseInt(aux[1])) == auxM[1]) {
                despmes.add(despesas.get(i));
            }
        }
        return despmes;
    }

    public List<Expense> getFMonthlyExpensesList(ExpenseType T, String month) {
        String[] aux = month.split("-");
        int[] auxM = new int[2];
        List<Expense> despesas = allExpenses;
        List<Expense> despmes = null;
        for (int i = 0; i < despesas.size(); i++) {
            auxM[0] = despesas.get(i).getMonth();
            auxM[1] = despesas.get(i).getYear();
            if ((Integer.parseInt(aux[0])) == auxM[0] && (Integer.parseInt(aux[1])) == auxM[1] && despesas.get(i).getExpenseType().equals(T)) {
                despmes.add(despesas.get(i));
            }
        }
        return despmes;
    }

    public BigDecimal getMonthlyExpenses(String month) {
        BigDecimal total = new BigDecimal(0);
        List<Expense> monthExpenses = new ArrayList<>();
        for (int i = 0; i < allExpenses.size(); i++) {
            if (allExpenses.get(i).getMonth() == Integer.parseInt(month)) {
                monthExpenses.add(allExpenses.get(i));
            }
        }
        for (int i = 0; i < monthExpenses.size(); i++) {
            total = new BigDecimal(total.doubleValue() + monthExpenses.get(i).getAmount().doubleValue());
        }
        return total;
    }

    public BigDecimal getWeeklyExpenses(int n) {
        List<Expense> weekExpenses = new ArrayList<>();
        BigDecimal total = new BigDecimal(0);

        for (int i = 0; i < allExpenses.size(); i++) {
            Calendar c = Calendar.getInstance();
            c.setTime(allExpenses.get(i).getDateOcurred());
            if (c.get(Calendar.WEEK_OF_YEAR) == n) {
                weekExpenses.add(allExpenses.get(i));
            }
        }

        for (int i = 0; i < weekExpenses.size(); i++) {
            total = new BigDecimal(total.doubleValue() + weekExpenses.get(i).getAmount().doubleValue());
        }
        return total;
    }

    public float calculateExpensesBalance() {
        float balance = 0;
        for (int i = 0; i < allExpenses.size(); i++) {
            balance = balance + allExpenses.get(i).getAmount().floatValue();

        }
        System.out.println("DEBUG - Balance: " + balance);
        return balance;
    }
}
