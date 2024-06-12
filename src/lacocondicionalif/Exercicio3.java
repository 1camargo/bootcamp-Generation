package lacocondicionalif;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String nomeDoador;
		int idade;
		boolean primeiraDoacao;

		System.out.println("Digite o nome do doador: ");
		nomeDoador = sc.nextLine();

		System.out.printf("\nDigite a idade do doador: ");
		idade = sc.nextInt();

		System.out.printf("\nPrimeira doação de sangue? ");
		primeiraDoacao = sc.nextBoolean();

		sc.close();

		if (idade >= 18 && idade <= 59) {
			System.out.println("\n" + nomeDoador + " está apto(a) para doar sangue!");
		} else if (idade >= 60 && idade <= 69 && primeiraDoacao == false) {
			System.out.println("\n" + nomeDoador + " está apto(a) para doar sangue!");
		} else {
			System.out.println("\n" + nomeDoador + " não está apto(a) para doar sangue!");
		}
	}

}
