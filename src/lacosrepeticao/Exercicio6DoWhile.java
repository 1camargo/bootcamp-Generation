package lacosrepeticao;

import java.util.Scanner;

public class Exercicio6DoWhile {

	public static void main(String[] args) {

		int numero = 0, contador = 0;
		float media = 0;

		Scanner sc = new Scanner(System.in);

		do {
			System.out.printf("Digite um número: ");
			numero = sc.nextInt();
		
			if ((numero%3 == 0) && (numero != 0)) {
				contador++;
				media += numero;
			}
		
		} while (numero != 0);

		sc.close();
		
		System.out.printf("\nA média de todos os números múltiplos de 3 é: %.1f", (media/contador));
	}
}
