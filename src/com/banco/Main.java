package com.banco;

public class Main {
	
	public static void main(String[] args) {
		Cliente cleonis = new Cliente();
		cleonis.setNome("Cleonis");
		
		
		Conta cc = new ContaCorrente(cleonis); 
		cc.depositar(100);
		
		Conta poupanca  = new ContaPoupança(cleonis); 
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}
	
}