package processoSupera.quarto;

import java.util.Scanner;

public class QuartoDesafio {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Números de caso de uso: ");
		int n = scanner.nextInt();
		scanner.nextLine(); 

		for (int i = 0; i < n; i++) {
			System.out.print("Texto a ser decifrado: ");
			String linhaImpressa = scanner.nextLine();

			int tamanho = linhaImpressa.length();
			int meio = tamanho / 2;
			String metadeEsquerda = linhaImpressa.substring(0, meio);
			String metadeDireita = linhaImpressa.substring(meio, tamanho);

			String metadeEsquerdaInvertida = new StringBuilder(metadeEsquerda).reverse().toString();
			String metadeDireitaInvertida = new StringBuilder(metadeDireita).reverse().toString();

			String decifrada = metadeEsquerdaInvertida + metadeDireitaInvertida;

			System.out.println(decifrada);
		}
	}
}
