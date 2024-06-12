package lacosrepeticao;

import java.util.Scanner;

public class Exercicio1For {

	public static void main(String[] args) {

		int numero1, numero2;

		Scanner sc = new Scanner(System.in);

		System.out.printf("Digite o primeiro número do intervalo: ");
		numero1 = sc.nextInt();

		System.out.printf("\nDigite o último número do intervalo: ");
		numero2 = sc.nextInt();

		sc.close();

		System.out.println("");
		if (numero1 < numero2) {
			for (int i = numero1; i <= numero2; i++) {
				if ((i % 3 == 0) && (i % 5 == 0)) {
					System.out.println(i + " é múltiplo de 3 e 5");
				}

			}
		} else {
			System.out.println("Intervalo inválido!");
		}
	}
}
