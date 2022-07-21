package br.com.fiap.banco;


public class Teste {
	
  public static void main(String[] args){
    Conta cc = new Conta();
    
    if (cc instanceof ContaCorrente){
      System.out.println("cc é do tipo ContaCorrente");
    }else{
      System.out.println("cc não é do tipo ContaCorrente");
    }
  }
}