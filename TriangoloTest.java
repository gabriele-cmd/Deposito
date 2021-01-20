/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author informatica
 */
public class TriangoloTest {
    
    public TriangoloTest() {
    }

    /**
     * Test of Triangolo method, of class Triangolo.
     */
    /*@Test
    public void testTriangolo() {
        System.out.println("Triangolo");
        double a = 0.0;
        double b = 0.0;
        double i = 0.0;
        Triangolo instance = new Triangolo(a, b, i);
        instance.Triangolo(a, b, i);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of perimetro method, of class Triangolo.
     */
    @Test
    public void testPerimetro() {
        double a = 10;
        double b = 15;
        double c = 12;
        System.out.println("Perimetro: ");
        Triangolo instance = new Triangolo(a, b, c);
        double expResult = 37;
        double result = instance.perimetro();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @Test
    public void testArea() {
        double a = 37;
        double b = 13;
        double c = 40;
        System.out.println("Area: ");
        Triangolo instance = new Triangolo(a, b, c);
        double expResult = 240;
        double result = instance.area();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testTipo() {
        System.out.println("Triangolo di tipo: ");
        Triangolo instance = new Triangolo(12, 12, 13);
        String expResult = "isoscele";
        String result = instance.testTipo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
