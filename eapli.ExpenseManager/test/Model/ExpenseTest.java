/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import eapli.util.DateTime;
import java.math.BigDecimal;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Outsider
 */
public class ExpenseTest {
    
    public ExpenseTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of toString method, of class Expense.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Expense instance = new Expense();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDateOcurred method, of class Expense.
     */
    @Test
    public void testGetDateOcurred() {
        System.out.println("getDateOcurred");
        Expense instance = new Expense();
        Date expResult = null;
        Date result = instance.getDateOcurred();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAmount method, of class Expense.
     */
    @Test
    public void testGetAmount() {
        System.out.println("getAmount");
        Expense instance = new Expense();
        BigDecimal expResult = null;
        BigDecimal result = instance.getAmount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMonth method, of class Expense.
     */
    @Test
    public void testGetMonth() {
        System.out.println("getMonth");
        Expense instance = new Expense("test", DateTime.newDate(2013,3,10), new BigDecimal(100.0));
        int expResult = 3;
        int result = instance.getMonth();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getYear method, of class Expense.
     */
    @Test
    public void testGetYear() {
        System.out.println("getYear");
        Expense instance = new Expense();
        int expResult = 0;
        int result = instance.getYear();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getExpenseType method, of class Expense.
     */
    @Test
    public void testGetExpenseType() {
        System.out.println("getExpenseType");
        Expense instance = new Expense();
        ExpenseType expResult = null;
        ExpenseType result = instance.getExpenseType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}