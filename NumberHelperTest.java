/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Gabriele
 */
public class NumberHelperTest {
    
    //public NumberHelperTest() {
    //}
    
    /**
     * Test of isEven method, of class NumberHelper.
     */
    @Test
    public void testisEven() {
        System.out.println("Numero pari?");
        NumberHelper instance = new NumberHelper(9);
        boolean expResult = false;
        boolean result = instance.isEven();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of isOdd method, of class NumberHelper.
     */
    @Test
    public void testisOdd() {
        System.out.println("Numero dispari?");
        NumberHelper instance = new NumberHelper(89);
        boolean expResult = true;
        boolean result = instance.isOdd();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of sum method, of class NumberHelper.
     */
    @Test
    public void testsum() {
        System.out.println("Il risultato è: ");
        NumberHelper instance = new NumberHelper(12);
        int expResult = 10;
        int result = instance.sum(-2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of isPrime method, of class NumberHelper.
     */
    @Test
    public void testisPrime() {
        System.out.println("");
        NumberHelper instance = new NumberHelper(17);
        boolean expResult = true;
        boolean result = instance.isPrime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of isDivisibleBy method, of class NumberHelper.
     */
    @Test
    public void testisDivisibleBy() {
        System.out.println("");
        NumberHelper instance = new NumberHelper(10);
        boolean expResult = false;
        boolean result = instance.isDivisibleBy(6);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
