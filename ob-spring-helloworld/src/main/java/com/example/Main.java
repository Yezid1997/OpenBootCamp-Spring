package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Calculadora calculadora = (Calculadora) context.getBean("calculadora");
		
		String texto = calculadora.holaMundo();
		System.out.println(texto);
		
		GestorFacturas gestor = (GestorFacturas) context.getBean("gestorFacturas");
		System.out.println(gestor.calculadora.holaMundo());
		System.out.println(gestor.nombre);
	}

}
