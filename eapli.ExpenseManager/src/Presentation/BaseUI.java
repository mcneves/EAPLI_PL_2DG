/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.BaseController;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author Outsider
 */
public abstract class BaseUI {

    protected abstract BaseController controller();

    public abstract void header();

    public abstract void run();

    public void show() {
        header();
        run();
        showBalances();
    }

    public void showBalances() {
         NumberFormat n = NumberFormat.getCurrencyInstance(Locale.FRANCE);
         
         BigDecimal wb = controller().getThisWeekExpenditure();
         BigDecimal mb = controller().getThisMonthExpenditure();
         double week = wb.doubleValue();
         double month = mb.doubleValue();
         System.out.println("Weekly expenditure: "+ n.format(week));
         System.out.println("Monthly expenditure: " + n.format(month));
    }
}

