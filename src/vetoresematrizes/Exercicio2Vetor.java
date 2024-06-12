package vetoresematrizes;

import java.util.Scanner;

public class Exercicio2Vetor {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int vetorNumeros[] = new int[10], soma = 0;
		float media = 0;
		String par = "", impar = "";

		for (int indice = 0; indice < vetorNumeros.length; indice++) {
			System.out.printf("Informe o " + (indice + 1) + "° valor: ");
			vetorNumeros[indice] = sc.nextInt();
			soma += vetorNumeros[indice];
			media++;
		}
		
		sc.close();

		for (int indice = 0; indice < vetorNumeros.length; indice++) {
			if (vetorNumeros[indice] % 2 == 0) {
				par += vetorNumeros[indice] + " ";
			} else {
				impar += vetorNumeros[indice] + " ";
			}

		}
		System.out.println("\nElementos nos índices ímpares: " + impar);
		System.out.println("Elementos nos índices pares: " + par);
		System.out.println("\nSoma: " + soma);
		System.out.println("Média: " + soma / media);
	}
}
