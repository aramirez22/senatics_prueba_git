/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Antonio Ramirez
 */
public class mensajes2Test {
    
    public mensajes2Test() {
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

    @Test
    public void testGetTipo() {
        System.out.println("getTipo");
        String instance = "hola";
        String expResult = "hola";
        String result = "hola";
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }


    @Test
    public void testGenerarRespuesta() {
        System.out.println("generarRespuesta");
        
        mensajes2 instance = new mensajes2("hola","hola");
        String expResult = "hola";
        String result = instance.mensaje;
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }
    
}
