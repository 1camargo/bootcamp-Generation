package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exercicio3HashSet {

	public static void main(String[] args) {

		Set<Integer> setNumeros = new HashSet<Integer>();
		int numero;

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			System.out.printf("Digite um número: ");
			numero = sc.nextInt();

			setNumeros.add(numero);
		}

		sc.close();

		Iterator<Integer> isetNumeros = setNumeros.iterator();

		System.out.println("\nListar dados do Set: ");

		while (isetNumeros.hasNext()) {
			System.out.println(isetNumeros.next());
		}
	}
}
