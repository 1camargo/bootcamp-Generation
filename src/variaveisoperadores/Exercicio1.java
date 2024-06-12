package variaveisoperadores;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		float salario, abono, novoSalario;
					
		System.out.println("Digite o valor do salário: ");
		salario = leia.nextFloat();
		
		System.out.println("\nDigite o valor do abono: ");
		abono = leia.nextFloat();
		
		novoSalario = salario + abono;
		
		System.out.printf("\n\nO valor do novo salário é: R$ %.2f", novoSalario);
		
		leia.close();				
	}

}
