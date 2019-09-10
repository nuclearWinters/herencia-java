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
public class FiguraTridimensional extends Figura {
    public FiguraTridimensional (int base, int altura, int ancho) {
        this.base = base;
        this.altura = altura;
        this.ancho = ancho;
    }
    public int base;
    public int altura;
    public int ancho;
    
    public double calcularArea () {
        return Math.pow(base*altura, 2);
    }
    
    public double calcularVolumen () {
        return (base*altura*ancho);
    }
    
    //public void descripcion() {
	//System.out.println("Esta es una " + tipo());
    //}
    
    public String tipo() { return "figura tridimensional"; }
    public void describir() {}
}
