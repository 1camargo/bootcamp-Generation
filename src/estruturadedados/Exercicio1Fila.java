package estruturadedados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio1Fila {

	public static void main(String[] args) {

		Queue<String> filaClientes = new LinkedList<String>();

		Scanner sc = new Scanner(System.in);

		int menu = 1;
		String nomeCliente;

		while (menu != 0) {

			System.out.println("\n========================================="
					+ "\n*  Número 1: Adicionar cliente na fila	*" 
					+ "\n*  Número 2: Listar todos os clientes	*"
					+ "\n*  Número 3: Retirar cliente da fila	*" 
					+ "\n*  Número 0: Sair			*"
					+ "\n=========================================");

			System.out.println("\nConforme a menu, digite o número correspondente a opção desejada: ");
			menu = sc.nextInt();

			
			 while (menu < 0 || menu > 3) { 
			 System.out.println("\nOpção inválida! Digite um número que corresponde a opção desejada: ");
			 menu = sc.nextInt();
			 }

			switch (menu) {
			case 1:
				System.out.println("\nDigite o nome do cliente: ");
				sc.skip("\\R?");
				nomeCliente = sc.nextLine();
				filaClientes.add(nomeCliente);

				System.out.println("\nFila: \n" + filaClientes);

				System.out.println("\nCliente adicionado! ");
				break;

			case 2:
				if (filaClientes.isEmpty()) {
					System.out.println("\nA fila está vazia!");
				} else {
					System.out.println("\nFila: \n" + filaClientes);
				}
				break;

			case 3:
				if (filaClientes.isEmpty()) {
					System.out.println("\nA fila está vazia!");
				} else {
					filaClientes.remove();
					System.out.println("\nFila: \n" + filaClientes);
					System.out.println("\nO cliente foi chamado!");
				}
				break;

			case 0:
				System.out.println("\nPrograma finalizado!");
				break;
				
			default:
				System.out.println("\nOpção inválida!");
			}

		}
		sc.close();
	}
}
