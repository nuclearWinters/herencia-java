/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.herencia;

/**
 *
 * @author Armando
 */
public class FiguraBidimensional extends Figura {
    public FiguraBidimensional (int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    public int base;
    public int altura;
    
    public double calcularArea () {
        return (base*altura);
    }
    
    public double calcularVolumen () {return 0;}
    
    public String tipo() { return "figura bidimensional"; }
    public void describir() {}
    
}
