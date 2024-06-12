package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio1ArrayList {

	public static void main(String[] args) {

		ArrayList<String> cores = new ArrayList<String>();

		String cor;

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			System.out.printf("Digite a " + (i+1) + "ª cor: ");
			sc.skip("\\R?");
			cor = sc.nextLine();

			cores.add(cor);
		}

		sc.close();

		System.out.println("\nListar todas as cores: ");
		for (int i = 0; i < cores.size(); i++) {
			System.out.println(cores.get(i));
		}
		/*for (String listarCores : cores) {
			System.out.println(listarCores);
		} */

		cores.sort(null);
		System.out.println("\nOrdenar as cores: ");
		for (String ordenarCores : cores) {
			System.out.println(ordenarCores);
		}
	}
}
