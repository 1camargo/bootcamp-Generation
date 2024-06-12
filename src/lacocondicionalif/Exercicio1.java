package lacocondicionalif;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		/*
		 * Faça um algoritmo em Java que leia 3 valores inteiros A, B e C e imprima na
		 * tela se a soma de A + B é maior, menor ou igual a C.
		 */

		int a, b, c; //a = 2, 2, 2 b = 4, 2, 2 c = 5, 5, 4

		Scanner leia = new Scanner(System.in);

		System.out.printf("Digite o valor de A: ");
		a = leia.nextInt();

		System.out.printf("\nDigite o valor de B: ");
		b = leia.nextInt();

		System.out.printf("\nDigite o valor de C: ");
		c = leia.nextInt();

		leia.close();

		if (a + b > c) {
			System.out.println("\nA soma de A + B é maior que o valor de C.");
		} else if (a + b == c) {
			System.out.println("\nA soma de A + B é igual ao valor de C.");
		} else {
			System.out.println("\nA soma de A + B é menor que o valor de C.");
		}
	}
}
