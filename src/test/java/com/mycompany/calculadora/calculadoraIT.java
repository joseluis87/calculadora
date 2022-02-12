/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.calculadora;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ceti
 */
public class calculadoraIT {
    
    public calculadoraIT() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }


    @Test
    public void testSuma() {
        System.out.println("suma");
        int a = 10;
        int b = 5;
        int expResult = 15;
        int result = calculadora.suma(a, b);
        assertEquals(expResult, result);

    }


    @Test
    public void testResta() {
        System.out.println("resta");
        int a = 10;
        int b = 5;
        int expResult = 5;
        int result = calculadora.resta(a, b);
        assertEquals(expResult, result);

    }


    @Test
    public void testMultiplicacion() {
        System.out.println("Multiplicacion");
        int a = 10;
        int b = 5;
        int expResult = 50;
        int result = calculadora.Multiplicacion(a, b);
        assertEquals(expResult, result);

    }


    @Test
    public void testDivision() {
        System.out.println("Division");
        int a = 10;
        int b = 5;
        int expResult = 2;
        int result = calculadora.Division(a, b);
        assertEquals(expResult, result);

    }


    @Test
    public void testPorcentaje() {
        System.out.println("porcentaje");
        int a = 50;
        int b = 100;
        int expResult = 50;
        int result = calculadora.porcentaje(a, b);
        assertEquals(expResult, result);

    }
}



