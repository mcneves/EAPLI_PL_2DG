/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

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
public class ExpenseTypeTest {
    
    public ExpenseTypeTest() {
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
     * Test of getdescription method, of class ExpenseType.
     */
    @Test
    public void testGetdescription() {
        System.out.println("getdescription");
        ExpenseType instance = new ExpenseType("X");
        String expResult = "X";
        String result = instance.getdescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class ExpenseType.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        ExpenseType instance = new ExpenseType("X");
        String expResult = "Type: X";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
    }
}