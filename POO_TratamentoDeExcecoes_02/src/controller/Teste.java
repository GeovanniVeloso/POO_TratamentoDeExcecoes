package controller;

import model.Conta;

public class Teste {

	public Teste() {
		super();
	}
	
	public void teste1(Conta cont) {
		cont.depositar(1000f);
		System.out.println("O saldo no teste 1 é igual a: R$"+cont.getSaldo());
	}
	
	public void teste2(Conta cont) throws ArithmeticException {
		cont.sacar(10000f);
		System.out.println("O saldo no teste 2 é igual a: R$"+cont.getSaldo());
	}
	
	public void teste3(Conta cont) {
		cont.sacar(1500f);
		System.out.println("O saldo no teste 3 é igual a: R$"+cont.getSaldo());
	}

}
