package lacosrepeticao;

import java.util.Scanner;

public class Exercicio2For {

	public static void main(String[] args) {

		int numero, par = 0, impar = 0;

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			System.out.printf("Digite o " + (i+1) + "° número: ");
			numero = sc.nextInt();

			if (numero % 2 == 0) {
				par++;
			} else {
				impar++;
			}

		}
		
		sc.close();
		
		System.out.println("\nTotal de números pares: " + par);

		System.out.println("Total de números ímpares: " + impar);

	}
}
