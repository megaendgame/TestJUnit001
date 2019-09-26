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
public class TestSumar {
    
    @Test
    public void testSumar() {
        System.out.println("Sumar");
        Calculadora instance = new Calculadora(8,0);
        //int expResult = 10;
        //int result = instance.Sumar();
        //assertEquals(expResult, result);
         assertTrue(instance.Sumar()==0);
        
    }
    
}
