package view;

import controller.OperacaoController;

public class Principal {

	public static void main(String[] args) {

		OperacaoController op = new OperacaoController();
		
		
		System.out.println("Inicio do Teste 01");
		System.out.println(op.operacaoValor(2));
		System.out.println("Fim do teste 01");
		
		System.out.println("Inicio do Teste 02");
		System.out.println(op.operacaoValor(3));
		System.out.println("Fim do Teste 02");
		
		System.out.println("Inicio do Teste 03");
		try {
			System.out.println(op.operacaoValor(-1));
		} catch (ArithmeticException e) {
			System.err.println(e.getMessage());
		}
		System.out.println("Fim do Teste 03");
		
	}

}
