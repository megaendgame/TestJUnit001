/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author endga
 */
public class TestMultiplicar {
    
    @Test
    public void testMultiplicar() {
        System.out.println("Multiplicar");
        Calculadora instance = new Calculadora(8,2);
        int expResult = 16;
        int result = instance.Multiplicar();
        assertEquals(expResult, result);
        
    }
    
}
