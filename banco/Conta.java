package br.com.fiap.banco;

import java.io.Serializable;

/**
* Classe que abstrai uma Conta Bancária
* @author daianarodrigues
* @version 1.0
*/

public class Conta implements Serializable {
	private static final long serialVersionUID = 1L;
	
	/**
	* Número da Agencia
	*/
	private int agencia;
	/**
	* Número da Conta
	*/
	private int numero;
	/**
	* Saldo da Conta
	*/
	private double saldo;
	
	public Conta() {
		
	}
	
	public Conta(int agencia, int numero, double saldo) {
	  
		 this.agencia = agencia; 
		 this.numero = numero; 
		 this.saldo = saldo;
	}
	
	/**
	* Deposita um valor ao saldo da conta
	* @param valor Valor a ser depositado
	*/
	public void depositar(double valor) {
		
		this.saldo += valor;
		
	}
	
	/**
	* Retira um valor do saldo da conta
	* @param valor Valor a ser retirado
	*/

	public void retirar(double valor) {
		
		this.saldo -= valor;
	}
	
	public double getSaldo() {
		
		return this.saldo;
	}
	
	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
}
