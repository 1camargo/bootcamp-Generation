package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exercicio2ArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> listaNumeros = new ArrayList<Integer>(Arrays.asList(2, 5, 1, 3, 4, 9, 7, 8, 10, 6));

		Scanner sc = new Scanner(System.in);

		int numero, posicao = 0;
		boolean encontrado = false;

		System.out.printf("Digite o número que você deseja encontrar: ");
		numero = sc.nextInt();

		sc.close();

		for (int i = 0; i < listaNumeros.size(); i++) {
			if (listaNumeros.get(i) == numero) {
				posicao = i;
				encontrado = true;
			}
		}
		if (encontrado) {
			System.out.printf("\nO número " + numero + " está localizado na posicação: " + posicao);
		} else {
			System.out.println("\nO número " + numero + " não foi encontrado!");
		}

	}
}
