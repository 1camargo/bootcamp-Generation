package variaveisoperadores;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;
		
		System.out.println("Informe o valor do salário bruto: ");
		salarioBruto = leia.nextFloat();
		
		System.out.println("\nInforme o valor do adicional noturno: ");
		adicionalNoturno = leia.nextFloat();
		
		System.out.println("\nInforme o valor das horas extras: ");
		horasExtras = leia.nextFloat();
		
		System.out.println("\nInforme o valor dos descontos: ");
		descontos = leia.nextFloat();
		
		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;
		
		System.out.printf("\n\nO valor do salário líquido é: R$%.2f", salarioLiquido);
		
		leia.close();
	}

}
