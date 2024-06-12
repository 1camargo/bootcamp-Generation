package lacocondicionalswitch;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		/*
		 * Com base na tabela abaixo, escreva um algoritmo em Java que leia o Nome do
		 * Colaborador (String), o Código do Cargo do Colaborador (número inteiro de 1 a
		 * 6) e o Salário (número float). A seguir, mostre na tela o Nome do
		 * Colaborador, o Cargo e o novo Salário reajustado.
		 */

		Locale.setDefault(Locale.US);
		
		Scanner leia = new Scanner(System.in);

		String nome;
		int cargo;
		float salario, novoSalario;

		System.out.println("Qual o seu nome?");
		nome = leia.nextLine();

		System.out.println("\n=================================");
		System.out.println("*  Número 1: Gerente 	 	*");
		System.out.println("*  Número 2: Vendedor      	*");
		System.out.println("*  Número 3: Supervisor	 	*");
		System.out.println("*  Número 4: Motorista	   	*");
		System.out.println("*  Número 5: Estoquista    	*");
		System.out.println("*  Número 6: Técnico de TI 	*");
		System.out.println("=================================");

		System.out.println("\nConforme a tabela, digite o número correspondente ao seu cargo");
		cargo = leia.nextInt();

		System.out.printf("\nInforme o seu salário: ");
		salario = leia.nextFloat();

		switch (cargo) {
		case 1:
			novoSalario = salario + (0.10f * salario);
			System.out.println("\n\nSeu nome é: " + nome);
			System.out.println("Seu cargo é: Gerente");
			System.out.printf("Seu novo salário é: R$%.2f", novoSalario);
			break;

		case 2:
			novoSalario = salario + (0.07f * salario);
			System.out.println("\n\nSeu nome é: " + nome);
			System.out.println("Seu cargo é: Vendedor");
			System.out.printf("Seu novo salário é: R$%.2f", novoSalario);
			break;

		case 3:
			novoSalario = salario + (0.09f * salario);
			System.out.println("\n\nSeu nome é: " + nome);
			System.out.println("Seu cargo é: Supervisor");
			System.out.printf("Seu novo salário é: R$%.2f", novoSalario);
			break;

		case 4:
			novoSalario = salario + (0.06f * salario);
			System.out.println("\n\nSeu nome é: " + nome);
			System.out.println("Seu cargo é: Motorista");
			System.out.printf("Seu novo salário é: R$%.2f", novoSalario);
			break;

		case 5:
			novoSalario = salario + (0.05f * salario);
			System.out.println("\n\nSeu nome é: " + nome);
			System.out.println("Seu cargo é: Estoquista");
			System.out.printf("Seu novo salário é: R$%.2f", novoSalario);
			break;

		case 6:
			novoSalario = salario + (0.08f * salario);
			System.out.println("\n\nSeu nome é: " + nome);
			System.out.println("Seu cargo é: Técnico de TI");
			System.out.printf("Seu novo salário é: R$%.2f", novoSalario);
			break;

		default:
			System.out.println("Opção inválida! Você deve escolher o cargo de 1 a 6.");

			leia.close();
		}
	}
}
