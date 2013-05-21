/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.ExpenseType;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nuno
 */
public class ExpenseTypeRegisterControllerTest {
    
    public ExpenseTypeRegisterControllerTest() {
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
     * Test of registerExpenseType method, of class ExpenseTypeRegisterController.
     */
    @Test
    public void testRegisterExpenseType() {
        System.out.println("registerExpenseType");
        String description = "X";
        ExpenseTypeRegisterController instance = new ExpenseTypeRegisterController();
        instance.registerExpenseType(description);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAllExpenseType method, of class ExpenseTypeRegisterController.
     */
    @Test
    public void testGetAllExpenseType() {
        System.out.println("getAllExpenseType");
        ExpenseTypeRegisterController instance = new ExpenseTypeRegisterController();
        
        List<ExpenseType> expResult = instance.getAllExpenseType();

        List<ExpenseType> result = instance.getAllExpenseType();
        
        result.add(new ExpenseType("A"));
        result.add(new ExpenseType("B"));
        
        expResult.add(new ExpenseType("A"));
        expResult.add(new ExpenseType("B"));
        
        for(int i=0; i < result.size(); i++ )
        {
            System.out.println("Expense " + result.get(i).getdescription());
        }
               
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}