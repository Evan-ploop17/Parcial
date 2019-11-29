/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

public class Calculadora {

    public static int suma(int a , int b){
        return a+b;
    }
    
    public static int resta(int a , int b){
        return a-b;
    }
    
    public static int multiplicar(int a , int b){
        return a*b;
    }
    
    public static double div(double a , double b){
        return a/b;
    }
    
    public static int exponente(int a , int b){
        return (int) Math.pow(a, b);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int total = exponente(2,4);
        System.out.println("Total: " + total );
    }
    
}
