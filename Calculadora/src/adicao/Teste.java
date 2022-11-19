package adicao;

import java.util.Scanner;

public class Teste {

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Soma soma = new Soma();
		System.out.println("Informe o primeiro valor.");
		soma.setValorI(scanner.nextInt());
		System.out.println("Informe o segundo valor.");
		soma.setValorII(scanner.nextInt());
		System.out.println("O resultado da soma é " + soma.calculo(soma.getValorI(), soma.getValorII()) + ".");
	}

}
