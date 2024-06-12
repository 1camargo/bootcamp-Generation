package lacosrepeticao;

import java.util.Scanner;

public class Exercicio5DoWhile {
	
	public static void main(String[] args) {
		
		int numero = 0, soma = 0;
		
		Scanner sc = new Scanner(System.in);
		
		do { 
			System.out.printf("Digite um número: ");
			numero = sc.nextInt();
			
			if (numero > 0) {
				soma += numero;
			}
			
		} while (numero != 0); 
		
		sc.close();
		
		System.out.println("\nA soma dos números positivos é: "+soma);
		
	}

}
