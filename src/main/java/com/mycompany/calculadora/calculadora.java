/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora;

/**
 *
 * @author ceti
 */
public class calculadora {
    
    
        public static int Multiplicacion(int a, int b) {
        return a*b;
    }
    public static int Division(int a, int b) {
        return a/b;
    }
    
        public static void main(String args[])
    {

        
        System.out.println("la multiplicación de 10 * 5 = "+ Multiplicacion(10,5));
        System.out.println("la division de 10 / 5 = "+ Division(10,5));
    }
    
}
