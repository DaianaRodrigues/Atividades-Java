package com.fiap.curso;

public class LengthStartEnds {
	
	public static void main(String[] args) {
		
		String descricao = new String("Maçã Gala, a maçã mais doce do mercado!");
		
		/*
		 * System.out.println(descricao.charAt(1));
		 * 
		 * 
		 * System.out.println(descricao.indexOf("G"));
		 * System.out.println(descricao.indexOf("Gala"));
		 */
		
		System.out.println(descricao.toLowerCase());
		System.out.println(descricao.toUpperCase());
		
		System.out.println(descricao.substring(0,4));
		System.out.println(descricao.substring(4));
		
		System.out.println(descricao.substring(
				descricao.indexOf("Maçã"),
				descricao.indexOf(" ")));
		
		System.out.println(descricao);
	}

}
