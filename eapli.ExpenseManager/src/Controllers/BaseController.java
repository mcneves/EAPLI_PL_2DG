package Controllers;

import Model.ExpenseRecord;
import Persistence.IExpenseRepository;
import Persistence.Inmemory.ExpenseRepository;
import Persistence.PersistenceFactory;
import eapli.util.DateTime;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import Persistence.PersistenceFactory;
import java.util.Date;

public class BaseController {
    public BigDecimal getThisWeekExpenditure(){
<<<<<<< HEAD
        IExpenseRepository repo=PersistenceFactory.getInstance().buildRepositoryFactory().getExpenseRepository();
=======
        IExpenseRepository repo= PersistenceFactory.getInstance().buildRepositoryFactory().getExpenseRepository();
>>>>>>> b1d88b3ada2cdec1f783d2192a466dc79a479697
        ExpenseRecord er=new ExpenseRecord(repo.getAllExpenses());
        int n = DateTime.currentWeekNumber();
        return er.getWeeklyExpenses(n);
    }
    
    public BigDecimal getThisMonthExpenditure(){
<<<<<<< HEAD
        IExpenseRepository repo=PersistenceFactory.getInstance().buildRepositoryFactory().getExpenseRepository();
=======
        IExpenseRepository repo= PersistenceFactory.getInstance().buildRepositoryFactory().getExpenseRepository();
>>>>>>> b1d88b3ada2cdec1f783d2192a466dc79a479697
        ExpenseRecord ER=new ExpenseRecord(repo.getAllExpenses());
        DateFormat dateFormat = new SimpleDateFormat("MM");
        Date d = new Date();
        return ER.getMonthlyExpenses(dateFormat.format(d));
    }
}

