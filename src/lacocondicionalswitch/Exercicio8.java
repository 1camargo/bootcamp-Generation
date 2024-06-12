package lacocondicionalswitch;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int operacao;
		float saldo = 1000.00f, valor;

		System.out.println("\n=================================");
		System.out.println("*  Código 1: Saldo	 	*");
		System.out.println("*  Código 2: Saque      	*");
		System.out.println("*  Código 3: Depósito		*");
		System.out.println("=================================");

		System.out.println("\nConforme a tabela, digite o número correspondente a operação desejada");
		operacao = sc.nextInt();

		while (operacao < 1 || operacao > 3) {
			System.out.println("\nO número digitado não corresponde a operação nunhema, digite de 1 a 3");
			operacao = sc.nextInt();
		}

		switch (operacao) {
		case 1: 
			System.out.printf("\nSaldo disponível: R$%.2f", saldo);
			break;

		case 2: 
			System.out.println("\nQual valor deseja sacar?");
			valor = sc.nextFloat();

			if (saldo < valor || valor < 0) {
				System.out.println("\nSaldo insuficiente!"); 
			} else {
				saldo -= valor;
				System.out.printf("\nNovo saldo: R$%.2f", saldo);
			}
			break;

		case 3:
			System.out.println("\nQual valor deseja depositar?");
			valor = sc.nextFloat();

			saldo += valor;
			System.out.printf("\nNovo saldo: R$%.2f", saldo);
			break;

		default: 
			System.out.println("Operação inválida!");
		}
		
		sc.close();

	}

}
