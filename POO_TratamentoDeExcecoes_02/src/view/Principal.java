package view;

import controller.Teste;
import model.Conta;

public class Principal {

	public static void main(String[] args) {
		Teste t = new Teste();
		Conta cont = new Conta();
		
		cont.setAgencia(14);
		cont.setCodigo(1146);
		cont.setLimite(150f);
		cont.setSaldo(1000);
		
		System.out.println("Inicio do Teste 01");
		t.teste1(cont);
		System.out.println("Fim do Teste 01");
		
		System.out.println("Inicio do Teste 02");
		try {
			t.teste2(cont);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		System.out.println("Fim do Teste 02");
		
		System.out.println("Inicio do Teste 03");
		t.teste3(cont);
		System.out.println("Fim do Teste 03");
		
	}

}
