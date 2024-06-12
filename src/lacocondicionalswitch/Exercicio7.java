package lacocondicionalswitch;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		float numero1, numero2, resultado;
		int operacao;

		System.out.printf("Digite o primeiro número: ");
		numero1 = sc.nextFloat();

		System.out.printf("\nDigite o segundo número: ");
		numero2 = sc.nextFloat();

		System.out.println("\n=================================");
		System.out.println("*  Código 1: Soma	 	*");
		System.out.println("*  Código 2: Subtração      	*");
		System.out.println("*  Código 3: Multiplicação	*");
		System.out.println("*  Código 4: Divisão		*");
		System.out.println("=================================");

		System.out.println("\nConforme a tabela, digite o número correspondente a operação desejada");
		operacao = sc.nextInt();
		while (operacao < 1 || operacao > 4) {
			System.out.println("\nO número digitado não corresponde a operação nunhema, digite de 1 a 4");
			operacao = sc.nextInt();
		}

		sc.close();

		switch (operacao) {
		case 1:
			resultado = numero1 + numero2;
			System.out.println("\nOperação feita: \n" + numero1 + " + " + numero2 + " = " + resultado);
			break;

		case 2:
			resultado = numero1 - numero2;
			System.out.println("\nOperação feita: \n" + numero1 + " - " + numero2 + " = " + resultado);
			break;

		case 3:
			resultado = numero1 * numero2;
			System.out.println("\nOperação feita: \n" + numero1 + " x " + numero2 + " = " + resultado);
			break;

		case 4:
			resultado = numero1 / numero2;
			System.out.println("\nOperação feita: \n" + numero1 + " ÷ " + numero2 + " = " + resultado);
			break;

		default:
			System.out.println("\nOperação inválida!");
		}

	}
}
