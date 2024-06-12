package lacocondicionalswitch;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		/*
		 * Com base na tabela abaixo, escreva um algoritmo em Java que leia o código de
		 * um item (número inteiro de 1 a 6) e a quantidade comprada deste item (número
		 * inteiro). A seguir, mostre na tela o valor total da conta e o nome do produto
		 * que foi comprado.
		 */

		Scanner leia = new Scanner(System.in);

		int numero, quantidade, valorTotal;

		System.out.println("================================== # # Menu # # ==================================");
		System.out.println("  Número 1: Cachorro Quente 		| 		Preço unitário R$10,00  ");
		System.out.println("  Número 2: X-Salada        		| 		Preço unitário R$15,00  ");
		System.out.println("  Número 3: X-Bacon		    	| 		Preço unitário R$18,00  ");
		System.out.println("  Número 4: Bauru		    	| 		Preço unitário R$12,00  ");
		System.out.println("  Número 5: Refrigerante    		|		Preço unitário R$8,00   ");
		System.out.println("  Número 6: Suco de laranja 		|		Preço unitário R$13,00  ");
		System.out.println("==================================================================================");

		System.out.printf("\nDigite qual opção do cardápio deseja: ");
		numero = leia.nextInt();

		switch (numero) {
		case 1:
			System.out.printf("\nInforme a quantidade que deseja: ");
			quantidade = leia.nextInt();
			valorTotal = (quantidade * 10);
			System.out.println("\n\nProduto: Cachorro Quente");
			System.out.println("Valor total: R$" + valorTotal);
			break;

		case 2:
			System.out.printf("\nInforme a quantidade que deseja: ");
			quantidade = leia.nextInt();
			valorTotal = (quantidade * 15);
			System.out.println("\n\nProduto: X-Salada");
			System.out.println("Valor total: R$" + valorTotal);
			break;

		case 3:
			System.out.printf("\nInforme a quantidade que deseja: ");
			quantidade = leia.nextInt();
			valorTotal = (quantidade * 18);
			System.out.println("\n\nProduto: X-Bacon");
			System.out.println("Valor total: R$" + valorTotal);
			break;

		case 4:
			System.out.printf("\nInforme a quantidade que deseja: ");
			quantidade = leia.nextInt();
			valorTotal = (quantidade * 12);
			System.out.println("\n\nProduto: Bauru");
			System.out.println("Valor total: R$" + valorTotal);
			break;

		case 5:
			System.out.printf("\nInforme a quantidade que deseja: ");
			quantidade = leia.nextInt();
			valorTotal = (quantidade * 8);
			System.out.println("\n\nProduto: Refrigerante");
			System.out.println("Valor total: R$" + valorTotal);
			break;

		case 6:
			System.out.printf("\nInforme a quantidade que deseja: ");
			quantidade = leia.nextInt();
			valorTotal = (quantidade * 13);
			System.out.println("\n\nProduto: Suco de laranja");
			System.out.println("Valor total: R$" + valorTotal);
			break;

		default:
			System.out.println("\n\nOpção inválida! Por gentileza, escolher entre as opções 1 e 6.");
		}

		leia.close();
	}
}
