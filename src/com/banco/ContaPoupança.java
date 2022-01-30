package com.banco;

public class ContaPoupança extends Conta{
	
	public ContaPoupança(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato conta corrente ===");
		super.imprimirInfosComuns();
	}

	
}
