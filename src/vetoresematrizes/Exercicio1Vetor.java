package vetoresematrizes;

import java.util.Scanner;

public class Exercicio1Vetor {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int vetorNumeros[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 }, 
				numero = 0,
				posicao = 1;
		boolean encontrado = false;

		System.out.printf("Digite o número que você deseja encontrar: ");
		numero = sc.nextInt();

		sc.close();
		
		for (int indice = 0; indice < vetorNumeros.length; indice++) {
			if (vetorNumeros[indice] == numero) {
				posicao = indice; 
				encontrado = true;
				System.out.println("\nO número " + numero + " foi encontrado na posição: " + posicao);
				break;
			}
		}

		if (encontrado != true) {
			System.out.println("\nO número " + numero + " não foi encontrado!");
		}
	}
}
