package lacosrepeticao;

import java.util.Scanner;

public class Exercicio3While {

	public static void main(String[] args) {

		int idade = 0, menores21 = 0, maiores50 = 0;
		Scanner sc = new Scanner(System.in);

		while (idade >= 0) {
			System.out.printf("Digite uma idade: ");
			idade = sc.nextInt();

			if (idade >=0 && idade < 21) {
				menores21++;
			} else if (idade > 50) {
				maiores50++;
			}
		}

		sc.close();

		System.out.println("\nTotal de pessoas menores de 21 anos: " + menores21);
		System.out.println("Total de pessoas maiores de 50 anos: " + maiores50);

	}
}
