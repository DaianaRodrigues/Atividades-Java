package com.fiap.curso;

public class CaixaString {
	
	public static void main(String[] args) {
		
	
	String nome = new String("maçã");
	String nome2 = new String("Maçã");
	String nome3 = new String("maçã");
	
	System.out.println(nome.equals(nome2)); //false
	
	System.out.println(nome.equalsIgnoreCase(nome2)); //true
	
	System.out.println(nome.equals(nome3)); //true
	
	boolean teste = (nome == nome3);
	System.out.println(teste); // false
	
	String nome4 = "maçã";
	String nome5 = "maçã";
	
	teste = (nome4 == nome5);
	System.out.println(teste); // false

	}
}
