package adicao;

import java.util.Scanner;

public class FelipeTest {

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Felipe felipe = new Felipe();
		System.out.println("Informe o primeiro valor.");
		felipe.setValorI(scanner.nextInt());
		System.out.println("Informe o segundo valor.");
		felipe.setValorII(scanner.nextInt());
		System.out.println("O resultado da soma é " + felipe.calculo(felipe.getValorI(), felipe.getValorII()) + ".");
	}

}
