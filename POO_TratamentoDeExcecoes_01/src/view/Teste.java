package view;

public class Teste {

	public static void main(String[] args) {
		System.out.println("Inicio do Main");
		try {
			metodo1();
		} catch (ArithmeticException e) {
			System.err.println("Divisão por Zero");
		}
		System.out.println("Fim do Main");

	}

	private static void metodo1() throws ArithmeticException {
		System.out.println("Inicio do Método 1");
		metodo2();
		System.out.println("Fim do Método 2");

	}

	private static void metodo2() throws ArithmeticException {
		System.out.println("Inicio do método 2");
		int[] vetor = new int[10];
		for (int i = 0; i <= 15; i++) {
			vetor[i] = i;
			System.out.println(i);
			if (i == 9) {
				int vlr = vetor[i] / vetor[0];
				System.out.println(vlr);
			}
		}
		System.out.println("Fim do método 2");

	}

}
