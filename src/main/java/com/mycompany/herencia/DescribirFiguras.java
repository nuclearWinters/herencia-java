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
public class DescribirFiguras {
    // No importa el tipo de Instrumento,
    // seguirá funcionando debido a Polimorfismo:
    static void describir(Figura i) {
	// ...
	i.descripcion();
    }

    static void describirTodo(Figura[] e) {
	for(int i = 0; i < e.length; i++)
	    describir(e[i]);
    }


    public static void main(String[] args) {
	Figura[] figuras = new Figura[6];
	int i = 0;
	// Up-casting al asignarse el Arreglo
	figuras[i++] = new FiguraBidimensional(20, 10);
	figuras[i++] = new FiguraTridimensional(10,10,10);
	figuras[i++] = new FiguraBidimensional(20,20);
	figuras[i++] = new FiguraTridimensional(15, 10, 5);
	figuras[i++] = new FiguraBidimensional(20, 30);
        figuras[i++] = new FiguraTridimensional(5, 5, 5);
	describirTodo(figuras);
    }
}
