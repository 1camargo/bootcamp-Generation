package estruturadedados;

import java.util.Scanner;
import java.util.Stack;

public class Exercicio2Pilha {

	public static void main(String[] args) {

		Stack<String> pilhaLivros = new Stack<String>();

		Scanner sc = new Scanner(System.in);

		int menu = 1;

		while (menu != 0) {
			System.out.println("\n========================================="
					+ "\n*  Número 1: Adicionar livro na pilha	*" 
					+ "\n*  Número 2: Listar todos os livros	*"
					+ "\n*  Número 3: Retirar livro da pilha	*" 
					+ "\n*  Número 0: Sair			*"
					+ "\n=========================================");

			System.out.println("\nConforme a menu, digite o número correspondente a opção desejada: ");
			menu = sc.nextInt();

			switch (menu) {
			
			case 1:
				System.out.println("\nDigite o nome do livro: ");
				sc.skip("\\R?");
				pilhaLivros.push(sc.nextLine());

				System.out.println("\nPilha: \n" + pilhaLivros);

				System.out.println("\nLivro adicionado!");
				break;

			case 2:
				if (pilhaLivros.isEmpty()) {
					System.out.println("\nA pilha está vazia!");
				} else {
					System.out.println("\nPilha: \n" + pilhaLivros);
				}
				break;

			case 3:
				if (pilhaLivros.isEmpty()) {
					System.out.println("\nA pilha está vazia!");
				} else {
					pilhaLivros.pop();
					System.out.println("\nPilha: \n" + pilhaLivros);
					System.out.println("\nUm livro foi retirado da pilha!");
				}
				break;

			case 0:
				System.out.println("\nPrograma finalizado!");
				break;

			default:
				System.out.println("\nOpção inválida");

			}
		}
		sc.close();
	}
}
