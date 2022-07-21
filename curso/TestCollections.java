package com.fiap.curso;

import java.util.ArrayList;
import java.util.List;

public class TestCollections {
	
	public static void main(String[] args) {
		
		
		/*
		 * ArrayList carrinho = new ArrayList(); Double valor = 100.55; int valor2 = 1;
		 * int valor3;
		 */
		  
			/*
			 * carrinho.add(valor); carrinho.add("Uva"); carrinho.add(valor2);
			 * 
			 * System.out.println(carrinho.get(1));
			 */
		 
		
		//Interface list e uso de Generics
		//Generics não permite tipos primitivos
		List<String> carrinho = new ArrayList<String>();
		
		System.out.println(carrinho.isEmpty());
		
		carrinho.add("Maçã");
		carrinho.add("Morango");
		carrinho.add("Maçã");
		carrinho.set(1, "Pera");
		
		System.out.println(carrinho.isEmpty());
		System.out.println(carrinho.size());
	}

}
