/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author endga
 */
public class TestRestar {
    
     @Test
    public void testRestar() {
        System.out.println("Restar");
        Calculadora instance = new Calculadora(8,10);
        int expResult = 0;
        int result = instance.Restar();
        assertEquals(expResult, result);
        //assertTrue(instance.Sumar()==0);
        
    }
    
}
