package vetoresematrizes;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4Matriz {

	public static void main(String[] args) {

		// Elabore um algoritmo que leia as notas de uma classe com 10 participantes
		// durante 4 bimestres de um ano. As 4 notas de cada participante serão
		// armazenadas em uma linha de uma matriz de números reais, logo cada linha da
		// matriz serão as notas de um participante. Em um vetor de números reais,
		// armazene as médias de cada participante e exiba as médias de cada um na tela.

		float matrizNotas[][] = new float[10][4], 
				vetorMedias[] = new float[10], media = 0;

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		for (int linha = 0; linha < matrizNotas.length; linha++) {
			System.out.printf((linha+1) + "° Aluno, informe suas notas:  \n");
			for (int coluna = 0; coluna < matrizNotas[0].length; coluna++) {
				System.out.printf("Digite a " + (coluna + 1) + "ª nota: ");
				matrizNotas[linha][coluna] = sc.nextFloat();
				media += matrizNotas[linha][coluna];
			}
			System.out.println();
			vetorMedias[linha] = media / matrizNotas[0].length;
			media = 0;
		}
		System.out.printf("Média dos alunos: ");
		for (int indice = 0; indice < vetorMedias.length; indice++) {
			System.out.printf("%.1f, ", vetorMedias[indice]);
		}

		sc.close();
	}
}
