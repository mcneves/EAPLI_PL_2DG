package Controllers;

import Model.ExpenseRecord;
import Persistence.Inmemory.ExpenseRepository;
import eapli.util.DateTime;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class BaseController {
    public BigDecimal getThisWeekExpenditure(){
        ExpenseRepository repo=new ExpenseRepository();
        ExpenseRecord er=new ExpenseRecord(repo.getAllExpenses());
        int n = DateTime.currentWeekNumber();
        return er.getWeeklyExpenses(n);
    }
    
    public BigDecimal getThisMonthExpenditure(){
        ExpenseRepository repo=new ExpenseRepository();
        ExpenseRecord ER=new ExpenseRecord(repo.getAllExpenses());
        DateFormat dateFormat = new SimpleDateFormat("MM");
        Date d = new Date();
        return ER.getMonthlyExpenses(dateFormat.format(d));
    }
}

