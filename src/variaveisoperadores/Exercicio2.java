package variaveisoperadores;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		float nota1, nota2, nota3, nota4, mediaFinal;
		
		System.out.println("Digite a primeira nota: ");
		nota1 = leia.nextFloat();
		
		System.out.println("\nDigite a segunda nota: ");
		nota2 = leia.nextFloat();
		
		System.out.println("\nDigite a terceira nota: ");
		nota3 = leia.nextFloat();
		
		System.out.println("\nDigite a quarta nota: ");
		nota4 = leia.nextFloat();
		
		mediaFinal = (nota1 + nota2 + nota3 + nota4)/4;
		
		System.out.printf("\n\nA média final do participante é: %.1f", mediaFinal);
		
		leia.close();
	}

}
