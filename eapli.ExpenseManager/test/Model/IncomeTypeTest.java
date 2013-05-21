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
 * @author Ricardo Rocha
 */
public class IncomeTypeTest {
    
    public IncomeTypeTest() {
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
     * Test of getdescription method, of class IncomeType.
     */
    //@Test
    public void testGetdescription() {
        System.out.println("getdescription");
        IncomeType instance = new IncomeType();
        String expResult = "";
        String result = instance.getdescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class IncomeType.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        IncomeType instance = new IncomeType("M");
        String expResult = "Description: M";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}