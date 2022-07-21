package com.fiap.curso;

public class Caixa {
	
	public static void main(String[] args) {
		
//		int qtdProdutos = 5;
//		int registro = 0;
		
		Produto[] produtos = new Produto[2];
		
		Produto prod1 = new Produto();
		prod1.setNome("Limão");
		prod1.setDescricao("Galego");
		prod1.setValor(4);
		
		Produto prod2 = new Produto();
		prod2.setNome("Maçã");
		prod2.setDescricao("Gala");
		prod2.setValor(5);
		
		produtos[0] = prod1;
		produtos[1] = prod2;
		
//		while (registro < qtdProdutos) {
//			registro++;
//			System.out.println("O produto número " + registro + " foi registrado");
//		}
		
//		do {
//			registro++;
//			System.out.println("O caixa registrou o produto " + registro);
//		} while (registro < qtdProdutos);
		
		for (Produto prod: produtos) {
			System.out.println(prod.toString());
		}
		
//		10 corredores com três prateleiras cada
		Produto[][] localizacaoProduto = new Produto[10][3];
		
		localizacaoProduto[0][1] = prod1;
		localizacaoProduto[1][1] = prod2;
		
		System.out.println(localizacaoProduto[0][1].getNome());
		
		
	}
	

}
