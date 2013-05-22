/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.BaseController;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author simaotiago
 */
public class GivenMonthExpensesUITest {
    
    public GivenMonthExpensesUITest() {
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
     * Test of controller method, of class GivenMonthExpensesUI.
     */
    @Test
    public void testController() {
        System.out.println("controller");
        GivenMonthExpensesUI instance = new GivenMonthExpensesUI();
        BaseController expResult = null;
        BaseController result = instance.controller();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of header method, of class GivenMonthExpensesUI.
     */
    @Test
    public void testHeader() {
        System.out.println("header");
        GivenMonthExpensesUI instance = new GivenMonthExpensesUI();
        instance.header();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of run method, of class GivenMonthExpensesUI.
     */
    @Test
    public void testRun() {
        System.out.println("run");
        GivenMonthExpensesUI instance = new GivenMonthExpensesUI();
        instance.run();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}