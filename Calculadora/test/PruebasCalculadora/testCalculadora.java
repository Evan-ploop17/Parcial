/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PruebasCalculadora;

import calculadora.Calculadora;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Esteban
 */
public class testCalculadora {
    
    public testCalculadora() {
    }
    
    @Test
    public void testSuma(){
        int resultado = Calculadora.suma(5,6);
        int espearado = 11;
        assertEquals(espearado, resultado);
    }
    @Test
    public void testResta(){
        int resultado = Calculadora.resta(5,6);
        int espearado = -1;
        assertEquals(espearado, resultado);
    }
    @Test
    public void testMultiplicar(){
        int resultado = Calculadora.multiplicar(5,6);
        int espearado = 30;
        assertEquals(espearado, resultado);
    }
    @Test
    public void testDiv(){
        double resultado = Calculadora.div(6.0 ,5.0);
        double espearado = 1.2;
        assertEquals(espearado, resultado, 0.00);
    }
    @Test
    public void testExponente(){
        int resultado = Calculadora.exponente(2, 3);
        int esperado = Calculadora.suma(Calculadora.multiplicar(2, 2), Calculadora.multiplicar(2, 2));
        assertEquals(esperado, resultado);
    }
}
