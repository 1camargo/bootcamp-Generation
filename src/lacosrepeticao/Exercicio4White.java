package lacosrepeticao;

import java.util.Scanner;

public class Exercicio4White {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int idade, genero, pessoaDev;
		int MulheresCisTransDevFrontEnd = 0, HomensCisETransDevMobile40 = 0, NBinariosFullStack30 = 0,
				totalPesquisa = 0, DevBackend = 0;
		float mediaIdade = 0.0f;
		char continuar = 's';

		while (continuar != 'n') {

			System.out.printf("Digite a sua idade: ");
			idade = sc.nextInt();

			System.out.println("\nDigite a sua identidade de gênero: " 
					+ "\n1 - Mulher Cis" 
					+ "\n2 - Homem Cis"
					+ "\n3 - Não Binário" 
					+ "\n4 - Mulher Trans" 
					+ "\n5 - Homem Trans" 
					+ "\n6 - Outros");
			genero = sc.nextInt();

			System.out.println("\nDigite o cargo o seu cargo de pessoa desenvolvedora: " + "\n1 - Backend"
					+ "\n2 - Frontend" + "\n3 - Mobile" + "\n4 - FullStack");
			pessoaDev = sc.nextInt();

			System.out.println("\nDeseja continuar a leitura dos dados de um novo colaborador? (S/N)");
			continuar = Character.toLowerCase(sc.next().charAt(0));
			System.out.println();

			if ((genero == 2 || genero == 4) && pessoaDev == 2) {
				MulheresCisTransDevFrontEnd++;

			} else if ((genero == 2 || genero == 5) && pessoaDev == 3 && idade >= 40) {
				HomensCisETransDevMobile40++;
			} else if (genero == 3 && pessoaDev == 4 && idade <= 30) {
				NBinariosFullStack30++;
			} else if (pessoaDev == 1) {
				DevBackend++;
			}
			totalPesquisa++;
			mediaIdade += idade;

		}

		System.out.printf("\nNúmero de pessoas desenvolvedoras Backend: " + DevBackend);
		System.out.printf("\nNúmero de mulheres cis e trans desenvolvedoras Frontend: " + MulheresCisTransDevFrontEnd);
		System.out.printf("\nNúmero de homens cis e trans desenvolvedores Mobile maiores de 40 anos: "
				+ HomensCisETransDevMobile40);
		System.out.printf(
				"\nNúmero de não binários desenvolvedores FullStack menores de 30 anos: " + NBinariosFullStack30);
		System.out.printf("\nNúmero total de pessoas que responderam à pesquisa: " + totalPesquisa);
		System.out.printf("\nIdade média das pessoas que responderam à pesquisa: %.2f", mediaIdade / totalPesquisa);

		sc.close();
	}

}
