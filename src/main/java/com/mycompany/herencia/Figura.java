
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
public class Figura {   
    public void descripcion() {
        if (calcularVolumen() == 0) {
            System.out.println("Esta es una " + tipo() + ". Tiene un area de " + calcularArea() + ".");
        } else {
            System.out.println("Esta es una " + tipo() + ". Tiene un area de " + calcularArea() + " y un volumen de " + calcularVolumen() + ".");
        }
    }
    public String tipo() {
	return "figura desconocida";
    }
    public double calcularArea () {return 0;}
    
    public double calcularVolumen () {return 0;}
    public void describir() {}
}

