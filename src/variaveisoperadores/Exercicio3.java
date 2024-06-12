package variaveisoperadores;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		float n1, n2, n3, n4, diferenca;
		
		System.out.println("Informe o valor do primeiro número: ");
		n1 = leia.nextFloat();
		
		System.out.println("\nInforme o valor do segundo número: ");
		n2 = leia.nextFloat();
		
		System.out.println("\nInforme o valor do terceiro número: ");
		n3 = leia.nextFloat();
		
		System.out.println("\nInforme o valor do quarto número: ");
		n4 = leia.nextFloat();
		
		diferenca = (n1 * n2) - (n3 * n4);
		
		System.out.printf("\n\nO valor da diferença é: %.1f", diferenca);
		
		leia.close();
	}

}
