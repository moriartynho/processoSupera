package processoSupera.primeiro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PrimeiroDesafio {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int primeiraLinha = scanner.nextInt();
		List<Integer> pares = new ArrayList<>(), impares = new ArrayList<>();

		for (int i = 0; i < primeiraLinha; i++) {
			int numero = scanner.nextInt();
			if (numero % 2 == 0) {
				pares.add(numero);
			} else
				impares.add(numero);

		}
		
		Collections.sort(pares);
		pares.forEach(System.out::println);
		
		Collections.sort(impares, Collections.reverseOrder());
		impares.forEach(System.out::println);

		
		
		scanner.close();
	}

}
