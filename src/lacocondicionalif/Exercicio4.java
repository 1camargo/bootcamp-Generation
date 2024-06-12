package lacocondicionalif;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String caracteristica1, caracteristica2, caracteristica3;

		System.out.println("Digite a primeira característica: ");
		caracteristica1 = sc.nextLine();

		System.out.println("\nDigite a segunda característica: ");
		caracteristica2 = sc.nextLine();

		System.out.println("\nDigite a terceira característica: ");
		caracteristica3 = sc.nextLine();
		
		sc.close();

		if (caracteristica1.equalsIgnoreCase("vertebrado") && caracteristica2.equals("ave")
				&& caracteristica3.equalsIgnoreCase("carnivoro")) {
			System.out.println("\nÁguia");
		} else if (caracteristica1.equalsIgnoreCase("vertebrado") && caracteristica2.equals("ave")
				&& caracteristica3.equalsIgnoreCase("onivoro")) {
			System.out.println("\nPomba");
		} else if (caracteristica1.equalsIgnoreCase("vertebrado") && caracteristica2.equals("mamifero")
				&& caracteristica3.equalsIgnoreCase("onivoro")) {
			System.out.println("\nHomem");
		} else if (caracteristica1.equalsIgnoreCase("vertebrado") && caracteristica2.equals("mamifero")
				&& caracteristica3.equalsIgnoreCase("herbivoro")) {
			System.out.println("\nVaca");
		} else if (caracteristica1.equalsIgnoreCase("invertebrado") && caracteristica2.equals("inseto")
				&& caracteristica3.equalsIgnoreCase("hematofago")) {
			System.out.println("\nPulga");
		} else if (caracteristica1.equalsIgnoreCase("invertebrado") && caracteristica2.equals("inseto")
				&& caracteristica3.equalsIgnoreCase("herbivoro")) {
			System.out.println("\nLagarta");
		} else if (caracteristica1.equalsIgnoreCase("invertebrado") && caracteristica2.equals("anelideo")
				&& caracteristica3.equalsIgnoreCase("hematofago")) {
			System.out.println("\nSanguessuga");
		} else if (caracteristica1.equalsIgnoreCase("invertebrado") && caracteristica2.equals("anelideo")
				&& caracteristica3.equalsIgnoreCase("onivoro")) {
			System.out.println("\nMinhoca");
		}
	}
}